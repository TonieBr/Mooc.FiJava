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
public class Stack {
    
    ArrayList<String> list = new ArrayList<>();
    
    public boolean isEmpty(){
        if (list.size() == 0){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        list.add(value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        String x = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return x;
    }
    
}
