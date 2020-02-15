/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.model;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class location implements Subject {
    /**
     * Location attributes
     */
    public String City;
    public String Country;
    public float longitude;
    public float latitude;
    public ArrayList locationObservers;
    public Subject Forecast;
/**
 * a method to add an observer
 * @param o 
 */
    @Override
    public void addObserver(Observer o) {
        locationObservers.add(o);
    }
/**
 * a method to remove an observer
 * @param o 
 */
    @Override
    public void removeObserver(Observer o) {
        int i = locationObservers.indexOf(o);
        if(i >= 0){
            locationObservers.remove(i);
        }
    }
/**
 * a method to notify the observers
 */
    @Override
    public void notifyObservers() {
      for(int i=0; i < locationObservers.size(); i++){
          Observer observer = (Observer) locationObservers.get(i);
          
      }
    }
    
}
