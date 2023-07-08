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
public class GradeStatistics {
    
    private ArrayList<Integer> gradeStatistics;
    
    public GradeStatistics(){
        gradeStatistics = new ArrayList<>();
    }
    
    public double average(){
        int sum = 0; 
        
        for (Integer integer : this.gradeStatistics){
            sum += integer;
        }
        
        return (double) sum / this.gradeStatistics.size();
    }
    
    public boolean anyPass(){
        for (Integer integer : gradeStatistics){
            if (integer >= 50){
                return true;
            }
        }
        return false;
    }
    
    public double pointAverage(){
        if (!(anyPass())){
            return -1;
        }
        
        int sum = 0;
        int counter = 0;
        
        for (Integer integer: this.gradeStatistics){
            if (integer >= 50){
                sum += integer;
                counter++;
            }
        }
        
        return (double) sum / counter;
    }
    
    public void add(int number){
        if (number >= 0 && number <= 100){
            this.gradeStatistics.add(number);
        }
    }
    
    public double passPercentage(){
        int counter = 0;
        
        for (Integer integer : this.gradeStatistics){
            if (integer >= 50){
                counter++;
            }
        }
        
        return (double) counter / this.gradeStatistics.size() * 100;
    }
    
    public void gradeDistribution(){
        int[] counters = new int[6];
        
        for (Integer integer : this.gradeStatistics){
            if (integer < 50){
                counters[0]++;
                continue;
            }
            if (integer < 60){
                counters[1]++;
                continue;
            }
            if (integer < 70){
                counters[2]++;
                continue;
            }
            if (integer < 80){
                counters[3]++;
                continue;
            }
            if (integer < 90){
                counters[4]++;
                continue;
            }
            if (integer >= 90){
                counters[5]++;
                continue;
            }
        }
        
        printGradeDistribution(counters);
        
        
    }
    
    public void printGradeDistribution(int[] grades){
        for (int i = grades.length - 1; i >= 0; i--){
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++){
                System.out.print("*");
        }
            System.out.println("");
    }
    }
}
