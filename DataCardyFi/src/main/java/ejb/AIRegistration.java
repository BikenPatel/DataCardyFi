/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.Tbl10thMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl12thMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl5thSemMarksheetOcrData;
import com.mycompany.datacardyfi.Tbl6thSemMarksheetOcrData;
import com.mycompany.datacardyfi.TblAadharOcrData;
import com.mycompany.datacardyfi.TblLcOcrData;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 *  
 */
@Stateless
public class AIRegistration implements AIRegistrationLocal {

    @PersistenceContext(unitName="DataCardyFiPU")
    EntityManager AIem;
    
    @Override
    public void SetAddharData(TblAadharOcrData addharData) {
        AIem.persist(addharData);
    }

    @Override
    public void Set10MarkSheetData(Tbl10thMarksheetOcrData Marksheet10data) {
        AIem.persist(Marksheet10data);
    }

    @Override
    public void Set12MarksheetData(Tbl12thMarksheetOcrData Marksheet12data) {
        AIem.persist(Marksheet12data);
    }

    @Override
    public void Set5SemMarksheetData(Tbl5thSemMarksheetOcrData Marksheet5data) {
        AIem.persist(Marksheet5data);
    }

    @Override
    public void Set6SemMarksheetData(Tbl6thSemMarksheetOcrData Marksheet6data) {
        AIem.persist(Marksheet6data);
    }

    @Override
    public void SetSclLCData(TblLcOcrData lcData) {
        AIem.persist(lcData);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
