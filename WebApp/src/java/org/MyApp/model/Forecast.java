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
import java.util.List;

public class Forecast implements Subject {
    /**
     * the main attributes for the forecast class
     */
    public ArrayList forecastObservers;
    public String location;
    public int temp;
    public int humidity;
    public int pressure;
    public int windSpeed;
    public int feelsTemp;

    /**
     * Getters and setters
     * @return 
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getFeelsTemp() {
        return feelsTemp;
    }

    public void setFeelsTemp(int feelsTemp) {
        this.feelsTemp = feelsTemp;
    }

    
    /**
     * methods for adding, removing and notifying observers
     * @param o 
     */
    @Override
    public void addObserver(Observer o){
        forecastObservers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = forecastObservers.indexOf(o);
        if (i >= 0) {
            forecastObservers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
       for (int i = 0; i < forecastObservers.size(); i++) {
           Observer observer = (Observer)forecastObservers.get(i);
           observer.updateForecast(location,temp,humidity,pressure,windSpeed,feelsTemp);
       } 
    }
    
    public void forecastValuesChanged(){
        notifyObservers();
    }
    
  
}
