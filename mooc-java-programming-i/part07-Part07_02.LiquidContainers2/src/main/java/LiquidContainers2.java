
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


 while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] array = input.split(" ");
            
            if (array[0].equals("add")){
                int toAdd = Integer.valueOf(array[1]);
                first.add(toAdd);
            }
            
            if (array[0].equals("move")){
                int toMove = Integer.valueOf(array[1]);
                
                if (toMove > first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                    continue;
                }
                
                first.remove(toMove);
                second.add(toMove);
            }
            
            if (array[0].equals("remove")){
                second.remove(Integer.valueOf(array[1]));
            }

        }
    }

}
