/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.TblStudentMaster;
import javax.ejb.Local;

/**
 *
 *  
 */
@Local
public interface LoginSessionBeanLocal {
    public TblStudentMaster getStudentByEmail(String email);
}
