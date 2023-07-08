/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class OneItemBox extends Box {
    
    private Item capacity;
    
    public OneItemBox(){}
    
    public void add(Item item){
        if (this.capacity == null){
            this.capacity = item;
        }
    }
    
    public boolean isInBox(Item item){
        if (this.capacity == null){
            return false;
        }
        
        if (this.capacity.equals(item)){
            return true;
        }
        
        return false;
    }
    
}
