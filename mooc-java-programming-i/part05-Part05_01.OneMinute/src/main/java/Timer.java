/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class Timer {
    
    private ClockHand ms = new ClockHand(100);
    private ClockHand sec = new ClockHand(60);
    
    public void advance(){
        this.ms.advance();
   
    if (this.ms.value() == 0){
        this.sec.advance();
    }
    
}
    
    public String toString(){
        
        String seconds;
        String milliseconds;
        
        if (this.sec.value() < 10){
            seconds = "0" + this.sec.value();
        } else {
            seconds = "" + this.sec.value();
        }
        
        if (this.ms.value() < 10){
            milliseconds = "0" + this.ms.value();
        } else {
            milliseconds = "" + this.ms.value();
        }
        
        return seconds + ":" + milliseconds;
    }
    
    
}

