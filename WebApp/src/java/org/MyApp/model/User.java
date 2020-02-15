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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.*;

public abstract class User implements Observer {
	
    public String personalID;
    public String forename;
    public String surname;
    public String address;
    public String password;
    public String username;
    public String email;    
    
    //THE FOLLOWING METHODS ARE IMPLEMENTED BY ALL    
    public void login () {} 
    
    //THIS METHOD IS USED ONLY BY THE COMPANY ADMINISTRATOR
    public void createAccount(){
        //Take the details of a person
        //Create an instance of the account
        //Add the details to the account
    }
    // COMPANY ADMINISTRATOR ONLY
    public void updateForecast(){
        
    }
}