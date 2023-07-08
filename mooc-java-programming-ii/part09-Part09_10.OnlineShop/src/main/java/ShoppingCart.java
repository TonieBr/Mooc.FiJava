/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    
    private List<Item> cart = new ArrayList<>();
    
    public ShoppingCart(){}
    
    public void add(String product, int price){
       
       Item temp = new Item(product, 1, price);
       
       for (Item produkt : cart){
           if (temp.equals(produkt)){
               produkt.increaseQuantity();
               return;
           }
       }
       
       cart.add(temp);
    }
    
    public int price(){
        int sum = 0;
        
        for (Item product : cart){
            sum += product.price();
        }
        
        return sum;
    }
    
    public void print(){
        for (Item product : cart){
            System.out.println(product);
        }
    }    
}
