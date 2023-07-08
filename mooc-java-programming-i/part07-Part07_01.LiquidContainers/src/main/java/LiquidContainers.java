
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] array = input.split(" ");
            
            if (array[0].equals("add")){
                int toAdd = Integer.valueOf(array[1]);
                if (toAdd > 0){
                first += toAdd;
                }
                if (first > 100){
                    first = 100;
                }
            }
            
            if (array[0].equals("move")){
                int toMove = Integer.valueOf(array[1]);
                
                if (toMove <= first){
                first -= toMove;
                second += toMove;
                } else {
                    second = first;
                    first = 0;
                }
                
                if (second > 100){
                    second = 100;
                }
            }
            
            if (array[0].equals("remove")){
                second -= Integer.valueOf(array[1]);
                
                if (second < 0){
                    second = 0;
                }
            }

        }
    }

}
