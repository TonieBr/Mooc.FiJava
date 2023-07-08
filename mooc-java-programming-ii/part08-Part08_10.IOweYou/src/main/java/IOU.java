import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class IOU {
    
    private HashMap<String, Double> list = new HashMap<>();
    
    public IOU(){
        
    }
    
    public void setSum(String toWhom, double amount){
        list.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        for (String name : list.keySet()){
            if (name.equals(toWhom)){
                return list.getOrDefault(toWhom, 0.0);
            }
        }
        
        return 0;
    }
}
