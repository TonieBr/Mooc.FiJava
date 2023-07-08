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
public class TodoList {
    
    private ArrayList<String> todoList = new ArrayList<>();
    
    public TodoList(){
    }
    
    public void add(String task){
        todoList.add(task);
    }
    
    public void print(){
        for (String task : todoList){
            System.out.println((todoList.indexOf(task) + 1) + ": " + task);
        }
    }
    
    public void remove(int number){
        this.todoList.remove(number - 1);
    }
    
    
}
