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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    
    public void add (String word, String translation){
        
        for (String toTranslate : dictionary.keySet()){
            if (toTranslate.equals(word)){
                dictionary.get(word).add(translation);
                return;
            }
        }
        
        ArrayList<String> temp = new ArrayList<>();
        temp.add(translation);
        
        dictionary.put(word, temp);
    }
    
    public ArrayList<String> translate (String word){
        
        for (String toFind : dictionary.keySet()){
            if (toFind.equals(word)){
                return dictionary.get(word);
            }
        }
        
        return new ArrayList<>();
    }
    
    public void remove(String word){
        
        for (String toRemove : dictionary.keySet()){
            if (toRemove.equals(word)){
                dictionary.get(word).clear();
            }
        }
        
    }
    
    
    
}
