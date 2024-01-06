/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:QuickRegisterResource
 * [QuickRegister]<br>
 * USAGE:
 * <pre>
 *        QuickRegisterClient client = new QuickRegisterClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 *  
 */
public class QuickRegisterClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/DataCardyFi/resources";

    public QuickRegisterClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("QuickRegister");
    }

    public void AddStudent(String name, String number, String email, String college, String program, String password) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("AddStudent/{0}/{1}/{2}/{3}/{4}/{5}", new Object[]{name, number, email, college, program, password})).request().post(null);
    }

    public <T> T getProgramsByCID(Class<T> responseType, String CollegeID) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getProgramsByCID/{0}", new Object[]{CollegeID}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getColleges(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getColleges");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
