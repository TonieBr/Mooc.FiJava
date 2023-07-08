/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Tónie
 */

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;

public class SaveableDictionary {
    
    private HashMap<String, String> dict = new HashMap<>();
    
    public void add(String words, String translation){
        if (dict.containsKey(words)){
            return;
        }
        
        this.dict.put(words, translation);
        this.dict.put(translation, words);
    }
    
    public String translate(String word){
        for (String words : dict.keySet()){
            if (words.equals(word)){
                return dict.get(word);
            }
        }
        
        return null;
        
    }
    
    public void delete(String word){
        dict.values().removeIf(s -> s.equals(word));
        dict.keySet().removeIf(s -> s.equals(word));
    }
    
}
