
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = null;

               while(true){
                   String input = scanner.nextLine();

                   if (input.equals("")){
                       break;
                   }

                   String[] array = input.split(",");

                   if (Integer.valueOf(array[1]) > oldest){
                       oldest = Integer.valueOf(array[1]);
                       oldestName = array[0];
                   }


               }

               System.out.println("Age of the oldest: " + oldestName);


    }
}
