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

public class Herd implements Movable {
    
    private ArrayList<Movable> list = new ArrayList<>();
    
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    
    public void move (int dx, int dy){
        for (Movable organism : list){
            organism.move(dx, dy);
        }
    }
    
    public String toString(){
        
        String tmp = "";
        
        for (Movable organism : list){
            tmp += organism.toString() + "\n";
        }
        
        return tmp;
    }
}
