/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cdi;

import client.QuickRegisterClient;
import com.mycompany.datacardyfi.TblColleges;
import com.mycompany.datacardyfi.TblProgram;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 *  
 */
@Named(value = "qRJSFManagedBean")
@ApplicationScoped
public class QRJSFManagedBean {
    
    private static final Logger logger = Logger.getLogger(QRJSFManagedBean.class.getName());

    QuickRegisterClient QRC;
    String Name;
    String Mobile_number;
    String Email;
    String College;
    String Program;
    String password;
    String rpassword;
    Response res;

    Collection<TblColleges> colleges;
    GenericType<Collection<TblColleges>> gColleges;
    
    Collection<TblProgram> programs;
    GenericType<Collection<TblProgram>> gprograms;
    
    /**
     * Creates a new instance of QRJSFManagedBean
     */
    public QRJSFManagedBean() {
        QRC = new QuickRegisterClient();
        colleges = new ArrayList<TblColleges>();
        gColleges = new GenericType<Collection<TblColleges>>() {};
        programs = new ArrayList<TblProgram>();
        gprograms = new GenericType<Collection<TblProgram>>() {};
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMobile_number() {
        return Mobile_number;
    }

    public void setMobile_number(String Mobile_number) {
        this.Mobile_number = Mobile_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String College) {
        this.College = College;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }
    
    public Collection<TblColleges> GetColleges() {
        res = QRC.getColleges(Response.class);
        colleges = res.readEntity(gColleges);
        return colleges;
    } 
    
    public Collection<TblProgram> GetPrograms() {
        return programs;
    }
    
    public Collection<TblProgram> GetProgramsByCID() {
        res = QRC.getProgramsByCID(Response.class, College);
        this.programs = res.readEntity(gprograms);
        return programs;
    }
    
    public void QuickRegister() {
        if(!isValidName(this.Name)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Name is not Valid", null));
        if(!isValidEmail(this.Email)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email is not Valid", null));
        if(!isValidMobileNumber(this.Mobile_number)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Mobile Number is not Valid", null));
        if(!checkPassword()) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passwords do not match", null));
        if(!isStrongPassword(this.password)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Password is not Strong Enough!! \n Make Sure Password is strong.", null));
        if(!isValidCollege(this.College)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select college.", null));
        if(!isValidProgram(this.Program)) FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Select program.", null));
        
        if(isValidName(this.Name) && isValidEmail(this.Email) && isValidMobileNumber(this.Mobile_number) && checkPassword() && isStrongPassword(this.password) && isValidCollege(this.College) && isValidProgram(this.Program)) {
            QRC.AddStudent(this.Name, this.Mobile_number, this.Email, this.College, this.Program, this.password);
            redirectToLoginPage();
        } else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something Wrong", null));
        
    }
    
    public Boolean checkPassword() {
        return ((this.password == null || this.rpassword == null) ? false : this.password.equals(this.rpassword));
    }
    
    public static boolean isStrongPassword(String password) {
        String uppercaseRegex = ".*[A-Z].*";
        String lowercaseRegex = ".*[a-z].*";
        String digitRegex = ".*\\d.*";
        String specialCharRegex = ".*[!@#$%^&*()-_=+\\[{\\]};:'\",<.>/?\\\\|`~].*";

        return password.matches(uppercaseRegex) &&
               password.matches(lowercaseRegex) &&
               password.matches(digitRegex) &&
               password.matches(specialCharRegex);
    }
    
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
    
    public boolean isValidName(String name) {
        String nameRegex = "^[a-zA-Z\\s]+$";
        return name.matches(nameRegex);
    }

    public boolean isValidMobileNumber(String mobileNumber) {
        String mobileRegex = "^\\d{10}$";
        return mobileNumber.matches(mobileRegex);
    }
    
    public boolean isValidCollege(String college) {
        return college != null;
    }
    
    public boolean isValidProgram(String program) {
        return program != null;
    }
    
    public void redirectToLoginPage() {
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "login.xhtml?faces-redirect=true");
    }
}
