
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int gameCounter = 0;
        int winCounter = 0;
        int loseCounter = 0;
        
        try {
        Scanner fileScanner = new Scanner(Paths.get(file));
        
        while (fileScanner.hasNextLine()){
            String record = fileScanner.nextLine();
            String[] arr = record.split(",");
            
            if (arr[0].equals(team)){
                gameCounter++;
                if (Integer.valueOf(arr[2]) > Integer.valueOf(arr[3])){
                    winCounter++;
                } else {
                    loseCounter++;
                }
            }
            if (arr[1].equals(team)){
                gameCounter++;
                if (Integer.valueOf(arr[3]) > Integer.valueOf(arr[2])){
                    winCounter++;
                } else {
                    loseCounter++;
                }
            }
            
            
        }
        
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + loseCounter);
        

    }

}
