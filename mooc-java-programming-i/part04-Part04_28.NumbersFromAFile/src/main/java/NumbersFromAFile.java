
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try{
        Scanner fileScanner = new Scanner(Paths.get(file));
        
        while (fileScanner.hasNextLine()){
            int check = Integer.valueOf(fileScanner.nextLine());
            if (check >= lowerBound && check <= upperBound){
                counter++;
            }
        }
        
        } catch (Exception e){
            System.out.println("Error");
        }
        
        System.out.println("Numbers: " + counter);

    }

}
