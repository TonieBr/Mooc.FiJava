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
public class Room {
    
    ArrayList<Person> list = new ArrayList<>();
    
    public void add (Person person){
        list.add(person);
    }
    
    public boolean isEmpty(){
        if (list.size() == 0){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return list;
    }
    
    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }
        
        int temp = list.get(0).getHeight();
        Person sendBack = list.get(0);
        
        for (Person person : list){
            if (temp > person.getHeight()){
                temp = person.getHeight();
                sendBack = person;
            }
        }
        return sendBack;
    }
    
    public Person take(){
        
       Person shortest = this.shortest();
       
       list.remove(shortest);
       
       return shortest;
       
    }
}
