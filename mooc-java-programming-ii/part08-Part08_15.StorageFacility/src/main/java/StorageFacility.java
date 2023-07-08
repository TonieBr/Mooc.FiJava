import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class StorageFacility {
    
    HashMap<String, ArrayList<String>> storage = new HashMap<>();
    
    public void add(String unit, String item){
        for (String content : storage.keySet()){
            if (content.equals(unit)){
                storage.get(unit).add(item);
                return;
            }
        }
        
        ArrayList<String> temp = new ArrayList<>();
        temp.add(item);
        storage.put(unit, temp);
       
    }
    
    public ArrayList<String> contents(String storageUnit){
        
        for (String content : storage.keySet()){
            if (content.equals(storageUnit)){
                return storage.get(content);
            }
            
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        for (String content : storage.keySet()){
            if (content.equals(storageUnit)){
                storage.get(content).remove(item);
            }
        }

    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        
        for (String content : storage.keySet()){
            if (storage.get(content).size() > 0){
                list.add(content);
            }
        }
        return list;
    }
}
