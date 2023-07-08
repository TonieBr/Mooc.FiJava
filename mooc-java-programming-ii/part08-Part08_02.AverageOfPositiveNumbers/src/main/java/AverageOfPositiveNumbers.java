import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0){
                break;
            }
            
            if (input < 0){
                continue;
            }
            
            list.add(input);
        }
        
        int sum = 0;
        
        for (Integer number : list){
            sum += number;
        }
        
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(( (double) sum / list.size()));
        }
        
    }
}
