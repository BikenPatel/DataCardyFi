/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.TblColleges;
import com.mycompany.datacardyfi.TblProgram;
import com.mycompany.datacardyfi.TblStudentMaster;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 *  
 */
@Local
public interface QuickRegisterLocal {
    
    public Collection<TblColleges> GetColleges();
    public Collection<TblProgram> GetPrograms();
    public void AddStudent(TblStudentMaster student);
    public Collection<TblProgram> GetProgramsByCollegeID(Integer CollegeID);
    public Integer GetCollegeIDByName(String name);
}
