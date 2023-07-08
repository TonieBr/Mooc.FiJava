
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();


    while (true) {
        
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            
            String input = scan.nextLine();
            String[] temp = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }
            
            if (temp[0].equals("add")){
                int toAdd = Integer.valueOf(temp[1]);
                first.add(toAdd);
                
            }
            
            if (temp[0].equals("move")){
                int toMove = Integer.valueOf(temp[1]);
                
                if (toMove > first.contains()){
                    second.add(first.contains());
                    first.remove(100);
                    continue;
                }
                
                first.remove(toMove);
                second.add(toMove);
            }
            
            if (temp[0].equals("remove")){
                int toRemove = Integer.valueOf(temp[1]);
                second.remove(toRemove);
            }
           
        }
    }

}
