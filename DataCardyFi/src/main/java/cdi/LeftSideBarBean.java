/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

/**
 *
 *  
 */
@Named(value = "leftSideBarBean")
@ApplicationScoped
public class LeftSideBarBean {

    /**
     * Creates a new instance of LeftSideBarBean
     */
    public LeftSideBarBean() {
    }
    
    private boolean IsDashboardActive;
    private boolean IsAIFormActive;
    private boolean IsManualFormActive;
    private boolean IsCheckFormActive;
    
    public void redirectToDashBoard() {
        setIsDashboardActive(true);
        setIsAIFormActive(false);
        setIsManualFormActive(false);
        setIsCheckFormActive(false);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "dashboard.xhtml?faces-redirect=true");
    }
    
    public void redirectToAIForm() {
        setIsDashboardActive(false);
        setIsAIFormActive(true);
        setIsManualFormActive(false);
        setIsCheckFormActive(false);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "registration.xhtml?faces-redirect=true");
    }
    
    public void redirectToManualForm() {
        setIsDashboardActive(false);
        setIsAIFormActive(false);
        setIsManualFormActive(true);
        setIsCheckFormActive(false);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "manualform.xhtml?faces-redirect=true");
    }
    
    public void redirectToCheckForm() {
        setIsDashboardActive(false);
        setIsAIFormActive(false);
        setIsManualFormActive(false);
        setIsCheckFormActive(true);
        FacesContext context = FacesContext.getCurrentInstance();
        NavigationHandler navHandler = context.getApplication().getNavigationHandler();
        navHandler.handleNavigation(context, null, "checkform.xhtml?faces-redirect=true");
    }

    public boolean isIsDashboardActive() {
        return IsDashboardActive;
    }

    public void setIsDashboardActive(boolean IsDashboardActive) {
        this.IsDashboardActive = IsDashboardActive;
    }

    public boolean isIsAIFormActive() {
        return IsAIFormActive;
    }

    public void setIsAIFormActive(boolean IsAIFormActive) {
        this.IsAIFormActive = IsAIFormActive;
    }

    public boolean isIsManualFormActive() {
        return IsManualFormActive;
    }

    public void setIsManualFormActive(boolean IsManualFormActive) {
        this.IsManualFormActive = IsManualFormActive;
    }

    public boolean isIsCheckFormActive() {
        return IsCheckFormActive;
    }

    public void setIsCheckFormActive(boolean IsCheckFormActive) {
        this.IsCheckFormActive = IsCheckFormActive;
    }
    
}
