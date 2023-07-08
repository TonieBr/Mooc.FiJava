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
    
    private Scanner scanner;
    private TodoList todoList;
    
   
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")){
                break;
            }
            
            if (input.equals("add")){
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            }
            
            if (input.equals("list")){
                this.todoList.print();
            }
            
            if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(toRemove);
            }
            
            
        }
    }
    
}
