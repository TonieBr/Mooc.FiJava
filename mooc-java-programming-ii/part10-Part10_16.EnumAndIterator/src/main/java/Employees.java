/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person> emp = new ArrayList<>(); 
    
    public void add(Person personToAdd){
        emp.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(s -> emp.add(s));
    }
    
    public void print(){
       Iterator<Person> iterator = this.emp.iterator();
       
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.emp.iterator();
        
        while (iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.emp.iterator();
        
        while (iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
