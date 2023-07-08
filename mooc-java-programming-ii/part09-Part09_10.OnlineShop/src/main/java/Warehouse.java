/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> prices = new HashMap<>();
    private Map<String, Integer> stocks = new HashMap<>();
        
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        for (String name : prices.keySet()){
            if (name.equals(product)){
                return prices.get(name);
            }
            
        }
        
        return -99;
    }
    
    public int stock(String product){
        for (String name : stocks.keySet()){
            if (name.equals(product)){
                return stocks.get(name);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product){
        for (String name : stocks.keySet()){
            if (name.equals(product)){
                if (stocks.get(name) > 0){
                stocks.replace(name, (stocks.get(name) - 1));
                return true;
                }
            }
        }
        
        return false;
    }
    
    public Set<String> products(){
        return stocks.keySet();
    }
    
}
