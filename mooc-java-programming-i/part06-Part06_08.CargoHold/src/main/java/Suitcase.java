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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int TotalWeight = 0;
        
        for (Item itemInList: items){
            TotalWeight += itemInList.getWeight();
        }
        
        if ( (TotalWeight + item.getWeight()) <= this.maxWeight ){
        items.add(item);
    }
    }
    
    public String toString(){
        int TotalWeight = 0;
        
        for (Item item: items){
            TotalWeight += item.getWeight();
        }
    
        if (items.size() == 0){
        return "no items (" + TotalWeight + " kg)";
        } else if (items.size() == 1){
        return items.size() + " item (" + TotalWeight + " kg)";        
        } else {
        return items.size() + " items (" + TotalWeight + " kg)";            
        }
    }
    
    public void printItems(){
        for (Item item: items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int TotalWeight = 0;
        
        for (Item item: items){
            TotalWeight += item.getWeight();
        }
        
        return TotalWeight;
    }
    
    public Item heaviestItem(){
        
        if (items.size() == 0){
            return null;
        }
        
        Item temp = items.get(0);
        int tempWeight = items.get(0).getWeight();
        
        for (Item item: items){
            if (item.getWeight() > tempWeight){
                temp = item;
                tempWeight = item.getWeight();
            }
            
        }
        return temp;
    }
}
