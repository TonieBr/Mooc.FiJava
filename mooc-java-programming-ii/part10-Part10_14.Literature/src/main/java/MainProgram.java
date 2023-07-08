
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> list = new ArrayList<>();
        
        while (true){
            
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String bookname = input;
            
            System.out.println("Age recommendation");
            int ageRec = Integer.valueOf(scanner.nextLine());
            
            Book temp = new Book(bookname, ageRec);
            
            list.add(temp);
            
            
            
        }
        
        System.out.println(list.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        
        Collections.sort(list, comparator);
        
        list.stream().forEach(s -> System.out.println(s));
        
    }

}
