/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import com.mycompany.datacardyfi.TblColleges;
import com.mycompany.datacardyfi.TblProgram;
import com.mycompany.datacardyfi.TblStudentMaster;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 *  
 */
@Stateless
public class QuickRegister implements QuickRegisterLocal {
    
    @PersistenceContext(unitName = "DataCardyFiPU")
    EntityManager QRM;

    @Override
    public Collection<TblColleges> GetColleges() {
        return (Collection<TblColleges>) QRM.createNamedQuery("TblColleges.findAll").getResultList();
    }

    @Override
    public Collection<TblProgram> GetPrograms() {
        return (Collection<TblProgram>) QRM.createNamedQuery("TblProgram.findAll").getResultList();    
    }

    @Override
    public void AddStudent(TblStudentMaster student) {
        QRM.persist(student);
    }

    @Override
    public Collection<TblProgram> GetProgramsByCollegeID(Integer CollegeID) {
        TypedQuery<TblProgram> query = QRM.createNamedQuery("TblProgram.findByCollegeId", TblProgram.class);
        query.setParameter("collegeId", CollegeID);
        return (Collection<TblProgram>) query.getResultList();
    }

    @Override
    public Integer GetCollegeIDByName(String name) {
        TypedQuery<TblColleges> query = QRM.createNamedQuery("TblColleges.findByCollege", TblColleges.class);
        query.setParameter("college", name);
        TblColleges t1 = query.getSingleResult();
        return t1.getId();
    }
}
