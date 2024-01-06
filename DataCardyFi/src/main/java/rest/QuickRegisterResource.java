/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package rest;

import com.mycompany.datacardyfi.TblColleges;
import com.mycompany.datacardyfi.TblProgram;
import com.mycompany.datacardyfi.TblStudentMaster;
import ejb.QuickRegisterLocal;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 *  
 */
@Path("QuickRegister")
@RequestScoped
public class QuickRegisterResource {

    @Context
    private UriInfo context;
    
    @EJB QuickRegisterLocal QR;
    private static final Logger logger = Logger.getLogger(QuickRegisterResource.class.getName());

    /**
     * Creates a new instance of QuickRegisterResource
     */
    public QuickRegisterResource() {
    }

    @GET
    @Path("getColleges")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblColleges> getColleges() {
        Collection<TblColleges> colleges = QR.GetColleges();
        return colleges;
    }
    
    @GET
    @Path("getProgramsByCID/{CollegeID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblProgram> getProgramsByCID(@PathParam("CollegeID")String College) {
        Integer cid = QR.GetCollegeIDByName(College);
        logger.log(Level.INFO, "getProgramsByCID() :: College id {0}", cid);
        return QR.GetProgramsByCollegeID(cid);
    }

    @POST
    @Path("AddStudent/{name}/{number}/{email}/{college}/{program}/{password}")
    public void AddStudent(@PathParam("name")String name, @PathParam("number")String number, @PathParam("email")String email, @PathParam("college")String college, @PathParam("program")String program, @PathParam("password")String password) {
        TblStudentMaster s1 = new TblStudentMaster();
        logger.log(Level.INFO, "AddStudent() :: name {0}", name);
        s1.setStudentName(name);
        s1.setMobileNumber(Long.parseLong(number));
        s1.setEmail(email);
        s1.setCollege(college);
        s1.setProgram(program);
        s1.setPassword(password);
        QR.AddStudent(s1);
    }
}
