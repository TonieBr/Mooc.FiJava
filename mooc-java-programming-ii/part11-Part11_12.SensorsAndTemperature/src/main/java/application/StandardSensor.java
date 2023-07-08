/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Tónie
 */
public class StandardSensor implements Sensor {
    
    private int reading;
    
    public StandardSensor(int reading){
        this.reading = reading;
    }
    
    public int read(){
        return this.reading;
    }
    
    public boolean isOn(){
        return true;
    }
    
    public void setOn(){};
    public void setOff(){};
    
    
    
}
