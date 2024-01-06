/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cdi;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *  
 */
@Named(value = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Map<String, Object> sessionAttributes;

    public SessionBean() {
        sessionAttributes = new HashMap<>();
    }

    public void setSessionAttribute(String attributeName, Object attributeValue) {
        sessionAttributes.put(attributeName, attributeValue);
    }

    public Object getSessionAttribute(String attributeName) {
        return sessionAttributes.get(attributeName);
    }

    public void removeSessionAttribute(String attributeName) {
        sessionAttributes.remove(attributeName);
    }

    public void clearSession() {
        sessionAttributes.clear();
    }
    
}
