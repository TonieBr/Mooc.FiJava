import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary; 
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
        
    }
    
    public void start(){
        while (true){
        System.out.println("Command: ");
        
        String input = this.scanner.nextLine();
        
        if (input.equals("end")){
            System.out.println("Bye bye!");
            break;
        } 
        
        if (input.equals("add")){
            System.out.println("Word: ");
            String word = this.scanner.nextLine();
            
            System.out.println("Translation: ");
            String translation = this.scanner.nextLine();
            
            this.simpleDictionary.add(word, translation);
            continue;
        }
        
        if (input.equals("search")){
            System.out.println("To be translated: ");
            String translated = this.scanner.nextLine();
            String translatedResult = this.simpleDictionary.translate(translated);
            
            if (translatedResult == null){
                System.out.println("Word " + translated + " was not found");
            } else {
                System.out.println("Translation: " + translatedResult);
            }
            continue;
        }
            
        
        System.out.println("Unknown command");
        
        
        }
    }
    
}
