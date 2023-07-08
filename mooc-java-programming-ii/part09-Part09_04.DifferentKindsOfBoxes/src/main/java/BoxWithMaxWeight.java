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

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> array = new ArrayList<>();
   
    public BoxWithMaxWeight(int capacity){
            this.capacity = capacity;
            
    }
    
    public void add(Item item){
        
        int sum = 0;
        
        for (Item product : array){
            sum += product.getWeight();
        }
        
        if (sum + item.getWeight() <= this.capacity ){
            this.array.add(item);
            sum += item.getWeight();
        }
        
    }
        
    public boolean isInBox(Item item){
        
        for (Item product : array){
            if (product.equals(item)) {
                return true;
            }
        }
        
        return false;
        
    }
    
}
