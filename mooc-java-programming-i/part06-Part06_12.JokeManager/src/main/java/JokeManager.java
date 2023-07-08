import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class JokeManager {
    
    private ArrayList<String> list = new ArrayList<>();
    
    public JokeManager(){
        
    }
    
    public void addJoke(String joke){
        
        list.add(joke);
        
    }
    
    public String drawJoke(){
        if (list.size() == 0){
            return "Jokes are in short supply.";
        }
        
         
        Random randomInt = new Random();
        int random = randomInt.nextInt(list.size());
        
        return list.get(random);
        
        
    }
    
    public void printJokes(){
        
        if (list.size() == 0){
            return;
        }
        
        for (String joke : list){
            System.out.println(joke);
        }
        
    }
    
}
