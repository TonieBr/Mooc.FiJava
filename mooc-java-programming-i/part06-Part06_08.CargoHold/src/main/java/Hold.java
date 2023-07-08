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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<>();
    
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        
        for (Suitcase suitcaseInList : list){
            totalWeight += suitcaseInList.totalWeight();
        }       
        
        if ( (totalWeight + suitcase.totalWeight()) <= this.maxWeight ){
        list.add(suitcase);
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        
        for (Suitcase suitcase : list){
            totalWeight += suitcase.totalWeight();
        }
        
        return list.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase : list){
            suitcase.printItems();
        }
    }
    
}
