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
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> content = new ArrayList<>();
    
    public void add(Card card){
        content.add(card);
    }
    
    public void print(){
        content.stream().forEach(s -> System.out.println(s));
    }
    
    public void sort(){
        Collections.sort(content);
    }
    
    public ArrayList<Card> getCard(){
        return this.content;
    }
    
    public int compareTo(Hand hand){
        int thisHandSum = content.stream().map(s -> s.getValue()).reduce(0, Integer::sum);
        int HandSum = hand.getCard().stream().map(s -> s.getValue()).reduce(0, Integer::sum);
        
        return thisHandSum - HandSum;
    }
    
    public void sortBySuit(){
       Collections.sort(content, new BySuitInValueOrder());
    }
    
}
