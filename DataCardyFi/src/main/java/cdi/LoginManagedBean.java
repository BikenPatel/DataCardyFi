/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cdi;

import com.mycompany.datacardyfi.TblStudentMaster;
import ejb.LoginSessionBeanLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 *  
 */
@Named(value = "loginManagedBean")
@ApplicationScoped
public class LoginManagedBean {
    
    @EJB LoginSessionBeanLocal LSB;
    @Inject
    private SessionBean sessionBean;
    @Inject
    private LeftSideBarBean sidebar;

    
    String email;
    String password;
    Integer StudentID;

    public LoginManagedBean() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean ValidateCredentials() {
        TblStudentMaster stud = LSB.getStudentByEmail(this.email);
        if(stud == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email Not Found", null));
            return false;
        }
        else return stud.getEmail().equals(this.email) && stud.getPassword().equals(this.password);
    }
    
    public void Login() {
        if(ValidateCredentials()) {
            TblStudentMaster stud = LSB.getStudentByEmail(this.email);
            this.StudentID = stud.getStudentId();
            sessionBean.setSessionAttribute("UserID", StudentID);
            redirectToDashboardPage();
        }
        else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Failed", null));
    }
    
    public void redirectToDashboardPage() {
        sidebar.setIsDashboardActive(true);
        sidebar.setIsAIFormActive(false);
        sidebar.setIsCheckFormActive(false);
        sidebar.setIsManualFormActive(false);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "dashboard.xhtml?faces-redirect=true");
    }
    public void redirectToRegistrationPage() {
        sidebar.setIsAIFormActive(true);
        sidebar.setIsCheckFormActive(false);
        sidebar.setIsDashboardActive(false);
        sidebar.setIsManualFormActive(false);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "registration.xhtml?faces-redirect=true");
    }
    
    public void redirectToQuickRegistrationPage() {
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "index.xhtml?faces-redirect=true");
    }
    
    public void LogOut() {
        sessionBean.removeSessionAttribute("UserID");
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "login.xhtml?faces-redirect=true");
    }
}
