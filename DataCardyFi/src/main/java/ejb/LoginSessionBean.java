/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.TblStudentMaster;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 *  
 */
@Stateless
public class LoginSessionBean implements LoginSessionBeanLocal {

    @PersistenceContext(unitName="DataCardyFiPU")
    EntityManager Loginem;
    
    @Override
    public TblStudentMaster getStudentByEmail(String email) {
        TypedQuery query = (TypedQuery) Loginem.createNamedQuery("TblStudentMaster.findByEmail");
        query.setParameter("email", email);
        try{
            return (TblStudentMaster) query.getSingleResult();
        } catch(NoResultException e) {
            return null;
        }
    }

    
}
