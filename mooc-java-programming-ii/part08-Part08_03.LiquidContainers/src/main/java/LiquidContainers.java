
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            
            System.out.print("> ");

            String input = scan.nextLine();
            String[] temp = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }
            
            if (temp[0].equals("add")){
                int toAdd = Integer.valueOf(temp[1]);
                
                if (toAdd < 0){
                    continue;
                }
                
                first += toAdd;
                
                if (first > 100){
                    first = 100;
                }
            }
            
            if (temp[0].equals("move")){
                int toMove = Integer.valueOf(temp[1]);
                
                if (toMove > first){
                    second += first;
                    first = 0;
                    continue;
                }
                
                if (toMove < 0){
                    continue;
                }
                
                first -= toMove;
                second += toMove;
                
                if (second > 100){
                    second = 100;
                }
            }
            
            if (temp[0].equals("remove")){
                int toRemove = Integer.valueOf(temp[1]);
                
                if (toRemove > second){
                    second = 0;
                    continue;
                }
                
                if (toRemove < 0){
                    continue;
                }
                
                second -= toRemove; 
                
            }
           
        }
    }

}
