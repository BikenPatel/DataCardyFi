/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cdi;

import com.mycompany.datacardyfi.TblAadharOcrData;
import ejb.AIRegistrationLocal;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 *
 *  
 */
@Named(value = "aIRegistration")
@ApplicationScoped
public class AIRegistrationManagedBean {
    
    private Part AadharCardFront;
    private Part AadharCardRear;
    private Part Marksheet10;
    private Part Marksheet12;
    private Part Marksheet5sem;
    private Part Marksheet6sem;
    private Part SchoolLC;
    
    private TblAadharOcrData AadharData;
    
    @Inject
    private SessionBean sessionBean;
    
    @EJB AIRegistrationLocal AIobj;
    private static final Logger logger = Logger.getLogger(AIRegistrationManagedBean.class.getName());
    
    private final Integer UserID = (Integer) sessionBean.getSessionAttribute("UserID");

    /**
     * Creates a new instance of AIRegistrationManagedBean
     */
    public AIRegistrationManagedBean() {
    }
    
    public void GetAadharFrontString() {
        logger.log(Level.SEVERE, "GetAadharString()");
        if(AadharCardFront == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String AadharFrtstr = callExternalAPI("eng", AadharCardFront);
        logger.log(Level.SEVERE, "Addhar card front string : {0}", AadharFrtstr);
        
        Map<String, String> extractedData = extractAadharData(AadharFrtstr);
        
        if (extractedData != null && !extractedData.isEmpty()) {
            // For example, you might want to store it in a database or perform other operations
            // Access the extracted data using the keys from the map
            String name = extractedData.get("Name");
            String dob = extractedData.get("Date of Birth");
            String adharNumber = extractedData.get("Adhaar Number");
            String sex = extractedData.get("Sex");
            
            
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            AadharData.setStudentName(name);
            AadharData.setAadharNumber(Integer.parseInt(adharNumber));
            AadharData.setStudentId(UserID);
            AadharData.setStudentAddress("");
            AadharData.setStudentCity("");
            AadharData.setStudentContry("");
            AadharData.setStudentPincode("");
            AadharData.setStudentState("");
            try {
                Date bdate = dateFormat.parse(dob);
                AadharData.setStudentDob(bdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            AIobj.SetAddharData(AadharData);
        } else {
            // Handle case where no data was extracted
            System.out.println("No Aadhar data extracted.");
        }
    }
    
    public void GetAadharRearString() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(AadharCardRear == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String aadharRearstr = callExternalAPI("eng", AadharCardRear);
        logger.log(Level.SEVERE, "Addhar card rear string : {0}", aadharRearstr);
    }
    
    public void GetMarksheet10String() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(Marksheet10 == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String marksheet10str = callExternalAPI("eng", Marksheet10);
        logger.log(Level.SEVERE, "10th marksheet string : {0}", marksheet10str);
    }
    
    public void GetMarksheet12String() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(Marksheet12 == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String marksheet12str = callExternalAPI("eng", Marksheet12);
        logger.log(Level.SEVERE, "12th marksheet string  : {0}", marksheet12str);
    }
    
    public void GetMarksheet5SemString() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(Marksheet5sem == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String marksheet5semstr = callExternalAPI("eng", Marksheet5sem);
        logger.log(Level.SEVERE, "5th sem marksheet string  : {0}", marksheet5semstr);
    }
    
    public void GetMarksheet6SemString() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(Marksheet6sem == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String marksheet6semstr = callExternalAPI("eng", Marksheet6sem);
        logger.log(Level.SEVERE, "6th sem marksheet string  : {0}", marksheet6semstr);
    }
    
    public void GetLCString() {
        logger.log(Level.SEVERE, "GetAadharString :");
        if(SchoolLC == null) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select Image first", null));
        String lcstr = callExternalAPI("eng", SchoolLC);
        logger.log(Level.SEVERE, "School LC string  : {0}", lcstr);
    }
    
    public String callExternalAPI(String lang, Part imageFile) {
        logger.log(Level.SEVERE, "callExternalAPI : ");
        try {
            String apiUrl = "http://localhost:1907/api/ocr";
            logger.log(Level.SEVERE, "API URL : {0} ", apiUrl);

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + "****");

            try (DataOutputStream request = new DataOutputStream(conn.getOutputStream())) {

                // Add string parameter to the request
                request.writeBytes("--****\r\n");
                request.writeBytes("Content-Disposition: form-data; name=\"DestinationLanguage\"\r\n\r\n");
                request.writeBytes(lang + "\r\n");

                // Add image file to the request
                request.writeBytes("--****\r\n");
                request.writeBytes("Content-Disposition: form-data; name=\"Image\"; filename=\"" + imageFile.getSubmittedFileName() + "\"\r\n");
                request.writeBytes("Content-Type: image/jpeg\r\n\r\n");

                InputStream fileInputStream = imageFile.getInputStream();
                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    request.write(buffer, 0, bytesRead);
                }
                request.writeBytes("\r\n");

                fileInputStream.close(); // Close the InputStream

                request.writeBytes("--****--\r\n");
                request.flush();
            }

            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }

                    // Process the API response
                    String apiResponse = response.toString();
                    conn.disconnect();
                    return apiResponse; // Return the API response
                }
            } else {
                // Handle error response
                System.out.println("API call failed with response code: " + responseCode);
            }
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Return null if an exception occurs or if there's an error
    }



    public Part getAadharCardFront() {
        return AadharCardFront;
    }

    public void setAadharCardFront(Part AadharCardFront) {
        this.AadharCardFront = AadharCardFront;
    }

    public Part getAadharCardRear() {
        return AadharCardRear;
    }

    public void setAadharCardRear(Part AadharCardRear) {
        this.AadharCardRear = AadharCardRear;
    }

    public Part getMarksheet10() {
        return Marksheet10;
    }

    public void setMarksheet10(Part Marksheet10) {
        this.Marksheet10 = Marksheet10;
    }

    public Part getMarksheet12() {
        return Marksheet12;
    }

    public void setMarksheet12(Part Marksheet12) {
        this.Marksheet12 = Marksheet12;
    }

    public Part getMarksheet5sem() {
        return Marksheet5sem;
    }

    public void setMarksheet5sem(Part Marksheet5sem) {
        this.Marksheet5sem = Marksheet5sem;
    }

    public Part getMarksheet6sem() {
        return Marksheet6sem;
    }

    public void setMarksheet6sem(Part Marksheet6sem) {
        this.Marksheet6sem = Marksheet6sem;
    }

    public Part getSchoolLC() {
        return SchoolLC;
    }

    public void setSchoolLC(Part SchoolLC) {
        this.SchoolLC = SchoolLC;
    }
    
    public Map<String, String> extractAadharData(String text) {
        Map<String, String> data = new HashMap<>();
        String[] lines = text.split("\n");
        List<String> textList = new ArrayList<>();

        for (String line : lines) {
            String trimmedLine = line.trim();
            textList.add(trimmedLine);
        }

        // Initialize variables
        String name = null;
        String dob = null;
        String adh = null;
        String sex;

        // Determine Sex
        if (text.toLowerCase().contains("female")) {
            sex = "FEMALE";
        } else {
            sex = "MALE";
        }

        try {
            // Get name, DOB, and Aadhar number
            int iCount = 0;
            for (String result : textList) {
            Pattern dobPattern = Pattern.compile("(?<!\\d)\\d{2}/\\d{2}/\\d{4}(?!\\d)");
            Matcher dobMatcher = dobPattern.matcher(text);
                if (dobMatcher.find()) {
                    dob = dobMatcher.group();
                } else {
                    dob = "DOB not found";
                }
                iCount++;
            }
            
            String[] tempName = textList.get(iCount - 1).split(" ");
            if (tempName.length <= 2) {
                StringBuilder sb = new StringBuilder();
                for (int j = iCount - 2; j <= iCount; j++) {
                    sb.append(textList.get(j)).append(" ");
                    logger.log(Level.SEVERE, "extractAadharData() sb : {0}", sb);                    
                }
                name = sb.toString().trim();
            } else {
                name = textList.get(iCount - 1);
            }

            Pattern namePattern = Pattern.compile("[A-Z][a-z]+(?: [A-Z][a-z]+)+");
            Matcher nameMatcher = namePattern.matcher(name);
            if (nameMatcher.find()) {
                name = nameMatcher.group();
            }

            String ocrString = String.join(" ", textList);
            Pattern aadharPattern = Pattern.compile("\\s\\b\\d{4}\\s\\d{4}\\s\\d{4}\\b");
            Matcher aadharMatcher = aadharPattern.matcher(ocrString);
            if (aadharMatcher.find()) {
                adh = aadharMatcher.group();
            }

            // Checking the length of Aadhar number
            if (adh != null && adh.length() >= 14) {
                System.out.println("Aadhar number is: " + adh);
            } else {
                System.out.println("Aadhar number not read");
                adh = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        data.put("Name", name);
        data.put("Date of Birth", dob);
        data.put("Adhaar Number", adh);
        data.put("Sex", sex);
        data.put("ID Type", "ADHAAR");
        return data;
    }   
}
