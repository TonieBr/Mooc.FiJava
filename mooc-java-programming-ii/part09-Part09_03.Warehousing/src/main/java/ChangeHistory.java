/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */

import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> array = new ArrayList<>();
    
    public ChangeHistory(){}
    
    public void add (double status){
        this.array.add(status);
    }
    
    public void clear(){
        this.array.clear();
    }
    
    public String toString(){
        return this.array.toString();
    }
    
    public double maxValue(){
        double temp = 0;
        
        for (double product : this.array){
            if (product > temp){
                temp = product;
            }
    }
        
        return temp;
    }
    
    public double minValue(){
          double temp = array.get(0);
        
        for (double product : this.array){
            if (product < temp){
                temp = product;
            }
    }
        return temp;     
    }
    
    public double average(){
        int number = 0;
        double sum = 0;
        
        for (double product : this.array){
            sum += product; 
            number++;
            
        }
        
        return sum / number;
    }
    
    
    
}
