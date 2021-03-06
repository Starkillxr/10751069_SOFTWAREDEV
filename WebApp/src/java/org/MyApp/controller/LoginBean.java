/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
    
    //Creates classes of userName and password, will need to link these to the Person attributes
    private String username;
    private String password;
 
    public String getUserName() {
        return username;
    }
 
    public void setUserName(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    /**
     * a method to validate the user login and depending on if the login is valid it will 
     * take the user to a specific main page
     * @return 
     */
    public String validateUserLogin() {
        String navResult = "";
        System.out.println("Entered Username is= " + username + ", password is= " + password);
        if (username.equals("CompanyAdministrator") && password.equals("CompanyAdministrator")) {
            navResult = "adminSuccess";}
        else if (username.equals("defaultUser") && password.equals("defaultUser")) {
            navResult = "success"; }
        else {
            navResult = "failure";
        }
        return navResult;
    }
    
}
