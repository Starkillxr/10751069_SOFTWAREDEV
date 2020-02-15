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
import org.MyApp.model.defaultUser;

/**
 *
 * @author Tom
 */

@ManagedBean(name = "AddDefaultUserBean")
@SessionScoped
public class addDefaultUser {
    
    private String personalID;
    private String forename;
    private String surname;
    private String address;
    private String password;
    private String username;
    private String email; 
    private defaultUser user = new defaultUser();
    private ArrayList<defaultUser> userList;
    /**
     * creates a user
     */
    @PostConstruct
    public void begin(){
        userList = new ArrayList<>();
        //Creates a preset entry
        user = new defaultUser("U0001", "Barry", "Holdman", "126 Zoo Lane", "behold123", "bholdman", "bholdman@aol.com");
        userList.add(user);
        
        user = new defaultUser();
        
        user.setUserList((ArrayList<defaultUser>) userList);
        
        user = new defaultUser();
        
        resetUser();
        
    }
    
    public addDefaultUser(){}
    /**
     * method to add a user
     */
    public void addUser(){
        user = new defaultUser();
        user = new defaultUser(this.personalID, this.forename, this.surname, this.address, this.password, this.username, this.email);
        userList.add(user);
        user.setUserList((ArrayList<defaultUser>) userList);
        user = new defaultUser();
        resetUser();
    }
    
    public List<defaultUser> getUsersList(){
        return userList;
    }
    public void resetUser(){
        user = new defaultUser();
    }
    /**
     * getters and setters
     * @return 
     */
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

    public defaultUser getUser() {
        return user;
    }

    public void setUser(defaultUser user) {
        this.user = user;
    }

    public ArrayList<defaultUser> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<defaultUser> userList) {
        this.userList = userList;
    }
    
    
}
