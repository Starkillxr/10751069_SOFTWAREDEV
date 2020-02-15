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
    public String City;
    public String Country;
    public float longitude;
    public float latitude;
    public ArrayList locationObservers;
    public Subject Forecast;

    @Override
    public void addObserver(Observer o) {
        locationObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = locationObservers.indexOf(o);
        if(i >= 0){
            locationObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
      for(int i=0; i < locationObservers.size(); i++){
          Observer observer = (Observer) locationObservers.get(i);
          
      }
    }
    
}
