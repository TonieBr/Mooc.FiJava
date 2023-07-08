
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();
        
        try {
        Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 5)
                .sorted( (p1, p2) -> { return p1[5].compareTo(p2[5]); })
                .forEach(s -> System.out.println( s[3] + " (" + s[4] + ")," + s[2].replace(" (%)", "") + ", " + s[5]));
        } catch (Exception e){
        System.out.println("Error" + e.getMessage());
        
    }
    }
}
