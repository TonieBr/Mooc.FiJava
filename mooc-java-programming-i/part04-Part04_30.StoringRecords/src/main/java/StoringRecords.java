
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        try {
        Scanner fileScanner = new Scanner(Paths.get(file));
        
        while (fileScanner.hasNextLine()){
            String record = fileScanner.nextLine();
            
            String[] arr = record.split(",");
            String newName = arr[0];
            int newAge = Integer.valueOf(arr[1]);
            
            Person newPerson = new Person(newName, newAge);
            
            persons.add(newPerson);
            
        }
        
        } catch (Exception e ){
        System.out.println("Error");
    }
        
        
        
        
        return persons;

    }
}
