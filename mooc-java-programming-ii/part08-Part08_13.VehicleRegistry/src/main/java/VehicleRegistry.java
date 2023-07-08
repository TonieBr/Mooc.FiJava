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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        for (LicensePlate licensePlates : owners.keySet()){
            if (licensePlates.equals(licensePlate)){
                return false;
            }
    }
        owners.put(licensePlate, owner);
        return true;
    }
    
    
    public String get(LicensePlate licensePlate){
        for (LicensePlate licensePlates : owners.keySet()){
            if (licensePlates.equals(licensePlate)){
                return owners.get(licensePlates);
            }
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        for (LicensePlate licensePlates : owners.keySet()){
            if (licensePlates.equals(licensePlate)){
                owners.remove(licensePlates);
                return true;
            }
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate licensePlates : owners.keySet()){
            System.out.println(licensePlates);
        }
    }
    
    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();
        for (String names : owners.values()){
            if (!(list.contains(names))){
                list.add(names);
            }
        }
        for (String name : list){
            System.out.println(name);
        }
        
    }
    
}
