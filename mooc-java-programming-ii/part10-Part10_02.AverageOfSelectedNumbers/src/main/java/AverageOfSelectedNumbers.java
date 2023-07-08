
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            
            list.add(input);
        }
        
        System.out.println("Print neg/pos? [n/p]");
        String answer = scanner.nextLine();
        
        double average = 0.0;
        
        if (answer.equals("p")){
        average = list.stream()
                .mapToInt(temp -> Integer.valueOf(temp))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        }
        
        if (answer.equals("n")){
        average = list.stream()
                 .mapToInt(temp -> Integer.valueOf(temp))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();     
        }
        
        System.out.println(average);
    
    }
}
