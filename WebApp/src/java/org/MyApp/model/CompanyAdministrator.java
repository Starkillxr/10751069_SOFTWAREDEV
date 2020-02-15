/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.model;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="Admin")
public class CompanyAdministrator extends User{
    private ArrayList adminList;
    /**
     * a constructor for a CompanyAdministrator
     * @param personalID
     * @param forename
     * @param surname
     * @param address
     * @param password
     * @param username
     * @param email 
     */
    public CompanyAdministrator(String personalID, String forename, String surname, String address, String password, String username, String email){
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public CompanyAdministrator() {
        
    }

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

    public ArrayList getAdminsList() {
        return adminList;
    }

    public void setAdminList(ArrayList adminsList) {
        this.adminList = adminList;
    }
    
    public void createAccount(){
        
    }
/**
 * implementing the updateForecast method in the CompanyAdministrator Class
 * @param location
 * @param temp
 * @param humidity
 * @param pressure
 * @param windSpeed
 * @param feelsTemp 
 */
    @Override
    public void updateForecast(String location, int temp, int humidity, int pressure, int windSpeed, int feelsTemp) {
        
    }

}
