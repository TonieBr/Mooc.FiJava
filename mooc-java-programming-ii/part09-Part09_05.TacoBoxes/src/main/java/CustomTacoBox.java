/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class CustomTacoBox implements TacoBox {
    
    int tacos;
    
    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }
    
    public int tacosRemaining(){
        return this.tacos;
}
    
    public void eat(){
        if (tacos >= 1){
        this.tacos--;
    }}
    
}
