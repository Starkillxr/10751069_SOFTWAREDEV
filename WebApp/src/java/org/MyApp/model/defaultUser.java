/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.model;

/**
 *
 * @author......
 */
import java.util.ArrayList;

public class defaultUser extends User {

private ArrayList userList;
private ArrayList locationsList;
public Subject location;
public String personalID;
public String forename;
public String surname;
public String address;
public String password;
public String username;
public String email;

    public defaultUser(String personalID, String forename, String surname, String address, String password, String username, String email) {
        this.personalID = personalID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public ArrayList getUserList() {
        return userList;
    }

    public void setUserList(ArrayList userList) {
        this.userList = userList;
    }

    public ArrayList getLocationsList() {
        return locationsList;
    }

    public void setLocationsList(ArrayList locationsList) {
        this.locationsList = locationsList;
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

    public defaultUser(){}   

    @Override
    public void updateForecast(String location, int temp, int humidity, int pressure, int windSpeed, int feelsTemp) {
    }
   
    public void addForecast(Subject Forecast){
        Forecast.addObserver(this);
    }
     
    public void createUser(){
        defaultUser userOne = new defaultUser();
        userOne.printUserDetails();
    }
    
    public void printUserDetails(){
        System.out.println("Your email is: " + email);
        System.out.println("Your name is: " + forename + " " + surname);
        System.out.println("Your Address is: "+ address);
        System.out.println("Your username is: " + username);
        System.out.println(" Your password is: " + password + " \n p.s. don't tell anyone your password");
        
    }
    
    public void addLocation(){
        locationsList = new ArrayList();
    }
}