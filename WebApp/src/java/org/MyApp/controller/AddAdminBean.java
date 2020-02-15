/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.MyApp.model.CompanyAdministrator;

/**
 *
 * @author Tom
 */
@ManagedBean(name= "AddAdminBean")
@SessionScoped
public class AddAdminBean {
    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private String email; 
    private CompanyAdministrator admin = new CompanyAdministrator();
    private ArrayList<CompanyAdministrator> adminList;
    
    @PostConstruct
    public void begin(){
        adminList = new ArrayList<>();
        
        admin = new CompanyAdministrator("AD0001", "Steve", "Jobs", "56 Zoo Lane", "apple", "sjobs", "sjobsss143@aol.com");
        adminList.add(admin);
        
        admin = new CompanyAdministrator();
        
        admin.setAdminList((ArrayList<CompanyAdministrator>)adminList);
        admin = new CompanyAdministrator();
        resetAdmin();
    }
    
    public AddAdminBean(){}
    
    public void addAdmin(){
        admin = new CompanyAdministrator();
        admin = new CompanyAdministrator(this.personalID, this.forename, this.surname, this.address, this.password, this.username, this.email);
        adminList.add(admin);
        admin.setAdminList((ArrayList<CompanyAdministrator>)adminList);
        admin = new CompanyAdministrator();
        resetAdmin();
    }
    
    public List<CompanyAdministrator> getAdminsList(){
        return adminList;
    }
    public void resetAdmin(){
        admin = new CompanyAdministrator();
    }
    
    //Getters and Setters
        public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public CompanyAdministrator getAdmin(){
        return admin;
    }
    
    public void setUser(CompanyAdministrator admin){
        this.admin = admin;
    }
    
    public ArrayList<CompanyAdministrator> getAdminList(){
        return adminList;
    }
    
    public void setAdminList(ArrayList<CompanyAdministrator> adminList){
        this.adminList = adminList;
    }
}
