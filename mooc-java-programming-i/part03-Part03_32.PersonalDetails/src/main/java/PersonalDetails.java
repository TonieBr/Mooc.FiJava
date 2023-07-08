
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        int length = 0;
        String name = null;
        
        while(true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            counter++;
            String[] array = input.split(",");
            sum += Integer.valueOf(array[1]);
            
            
            
            if (array[0].length() > length ){
                length = array[0].length();
                name = array[0];
                } 
            }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / counter);
                        

        }
    }
