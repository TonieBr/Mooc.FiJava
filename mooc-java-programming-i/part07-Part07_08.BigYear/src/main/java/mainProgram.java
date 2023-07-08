import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> birdsDB = new ArrayList<>();
        
        while (true){
            System.out.println("?");
            String input = scan.nextLine();
            
            // ADD COMMAND // 
            if (input.equals("Add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                
                Bird tempBird = new Bird(name, latinName);
                birdsDB.add(tempBird);
            }
            
            // OBSERVATION COMMAND // 
            if (input.equals("Observation")){
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
            boolean found = false;
            
            for (Bird birds : birdsDB){
                if (birds.getName().equals(bird)){
                    birds.addObservation();
                    found = true;
                }
            }
          
            if (found == false){
                System.out.println("Not a bird!");
            }
            }
                
                
            // ALL COMMAND // 
            if (input.equals("All")){
                for (Bird birddb : birdsDB){
                    System.out.println(birddb);
                }
            }
            
            // ONE COMMAND // 
            if (input.equals("One")){
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
                for (Bird birddb : birdsDB){
                    if (birddb.getName().equals(bird)){
                        System.out.println(birddb);
                    }
                }
            }
            
            // QUIT COMMAND // 
            if (input.equals("Quit")){
                break;
            }
        }
    }

}
