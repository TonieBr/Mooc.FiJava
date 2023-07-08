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
    Scanner scanner;
    GradeStatistics gradeStatistics;
    
    UserInterface(Scanner scanner, GradeStatistics gradeStatistics){
       this.scanner = scanner;
       this.gradeStatistics = gradeStatistics;
    }
    
    public void start(){
        System.out.println("Enter point toals, -1 stops");        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1){
                break;
            }
            
            gradeStatistics.add(input);
            
        }
        
        // Simple Average
        System.out.println("Point average (all): " + gradeStatistics.average());
        
        // Passing Average
        if(gradeStatistics.anyPass()){
            System.out.println("Point average (passing): " + gradeStatistics.pointAverage());
        } else {
            System.out.println("Point average (passing): -");           
        }
        
        // Passing Percentage
        System.out.println("Pass percentage: " + gradeStatistics.passPercentage());
        
        // Grade Distribution
        System.out.println("Grade distribution: ");
        gradeStatistics.gradeDistribution();
    }
}
