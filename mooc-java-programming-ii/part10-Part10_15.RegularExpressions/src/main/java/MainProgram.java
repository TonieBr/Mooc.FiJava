

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();
        
        if (checker.timeOfDay("23:41:16") == true){
            System.out.println("The form is correct");
        } else { 
            System.out.println("The form is incorrect");
        }
    }
}
