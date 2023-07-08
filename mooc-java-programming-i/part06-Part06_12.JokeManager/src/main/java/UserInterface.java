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
public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;
  
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = this.scanner.nextLine();
            
            if (input.equals("X")){
                break;
            }
            
            if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String addJoke = this.scanner.nextLine();
                jokeManager.addJoke(addJoke);
            }
            
            if (input.equals("2")){
                System.out.println(jokeManager.drawJoke());
            }
            
            if (input.equals("3")){
                jokeManager.printJokes();
            }
            
        }
    }
    
}
