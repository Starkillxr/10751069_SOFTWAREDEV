/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.MyApp.model;


public interface Observer {
    /**
     * a method for updating the forecast
     * @param location
     * @param temp
     * @param humidity
     * @param pressure
     * @param windSpeed
     * @param feelsTemp 
     */
public void updateForecast(String location, int temp, int humidity, int pressure, int windSpeed, int feelsTemp);
}
