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

public class Box implements Packable {
    
    private ArrayList<Packable> list = new ArrayList<>();
    private double capacity;
    
    public Box(double capacity){
        this.capacity = capacity;
    }
    
    public void add(Packable product){
        
        double total = this.weight();

        
        if (product.weight() + total < this.capacity ){
        list.add(product);
        }
    }
    
    public double weight(){
        double total = 0;
        for (Packable pack : list){
            total += pack.weight();
        }
        return total;
    }
    
    
    public String toString(){
        return "Box: " + list.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
