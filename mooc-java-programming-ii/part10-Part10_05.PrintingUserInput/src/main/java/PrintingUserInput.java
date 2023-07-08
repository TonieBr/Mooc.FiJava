
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> temp = new ArrayList<>();
        
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            temp.add(input);
        }
        
        temp.stream().forEach(s -> System.out.println(s));
        
    }
}
