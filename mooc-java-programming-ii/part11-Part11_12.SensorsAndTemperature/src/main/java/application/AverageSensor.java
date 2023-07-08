/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tónie
 */
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> list = new ArrayList<>();
    private ArrayList<Integer> readings = new ArrayList<>();
    
    public void addSensor(Sensor toAdd){
        list.add(toAdd);
    }
    
    public void setOn(){
        list.forEach(s -> s.setOn());
    }
    
    public void setOff(){
        list.forEach(s -> s.setOff());
    }
    
    public int read(){
        
        if (list.get(0).isOn() == false || list.isEmpty()){
            throw new IllegalStateException();
        }
        
        int sum = 0;
        
        for (Sensor sensor : list){
            sum += sensor.read();
        }
        
        int average = sum / list.size();
        this.readings.add(average);
        return average;
    }
    
    public boolean isOn(){
        return list.get(0).isOn();
    }
    
    public List<Integer> readings(){
        
        return readings;
        
    }
    
    
}
