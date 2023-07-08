/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Tónie
 */
public class TemperatureSensor implements Sensor {
    
    private boolean status;
    private int reading;
    
    public void setOn(){
        this.status = true;
    }
    
    public void setOff(){
        this.status = false;
    }
    
    public boolean isOn(){
        return status;
    }
    
    public int read(){
        
        if (this.status = false){
            throw new IllegalStateException();
        }
        
        return new Random().nextInt(60) - 30;
    }
    
    
}
