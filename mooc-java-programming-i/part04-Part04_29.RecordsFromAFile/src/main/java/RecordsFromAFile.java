
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        
        String file = scanner.nextLine();
        
        try{
            Scanner fileScanner = new Scanner(Paths.get(file));
            
            while (fileScanner.hasNextLine()){
                String result = fileScanner.nextLine();
                
                String[] arr = result.split(",");
                
                if (arr[1] != "1"){
                System.out.println(arr[0] + ", age: " + arr[1] + " years");
                } else {
                    System.out.println(arr[0] + ", age: " + arr[1] + " year");
                }
            }
            
        } catch (Exception e){
            System.out.println("Error");
        }
        

    }
}
