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

public class Abbreviations {
    
    private HashMap<String, String> list = new HashMap<>();
    
    public void addAbbreviation(String abbreviation, String explanation){
        list.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (list.containsKey(abbreviation)){
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation)){
            return list.get(abbreviation);
        }
        
        return null;
    }
    
}
