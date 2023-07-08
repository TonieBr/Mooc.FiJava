import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInformation = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        while (true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.equals("")){
                break; 
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book newBook = new Book(title, pages, year);
            
            bookInformation.add(newBook);
            
        }
        
        System.out.println("What information will be printed?");
        
        String input = scanner.nextLine();
        
        if (input.equals("everything")){
            for (Book books : bookInformation){
                System.out.println(books);
            }
        } else if (input.equals("name")){
            for (Book books : bookInformation){
                System.out.println(books.getName());
            }
        }
        
        

    }
}
