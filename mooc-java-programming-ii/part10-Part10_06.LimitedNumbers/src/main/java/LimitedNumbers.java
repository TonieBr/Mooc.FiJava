
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        
        while (true){
            Integer input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0){
                break;
            }
            
            temp.add(input);
            
        }
       
        temp.stream().filter(numb -> numb >= 1 & numb <= 5).forEach(s -> System.out.println(s));
        
    }
}
