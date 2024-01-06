/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.Tbl10thMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl12thMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl5thSemMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl6thSemMarksheetOcrData;
import com.mycompany.datacardyfi.TblAadharOcrData;
import com.mycompany.datacardyfi.TblLcOcrData;
import javax.ejb.Local;

/**
 *
 *  
 */
@Local
public interface AIRegistrationLocal {
    public void SetAddharData(TblAadharOcrData addharData);
    public void Set10MarkSheetData(Tbl10thMarksheetOcrData Marksheet10data);
    public void Set12MarksheetData(Tbl12thMarksheetOcrData Marksheet12data);
    public void Set5SemMarksheetData(Tbl5thSemMarksheetOcrData Marksheet5data);
    public void Set6SemMarksheetData(Tbl6thSemMarksheetOcrData Marksheet6data);
    public void SetSclLCData(TblLcOcrData lcData);
}
