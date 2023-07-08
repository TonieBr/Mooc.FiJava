
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static List<Integer> positive (List<Integer> numbers){
        ArrayList<Integer> temp = numbers.stream()
                .filter(numb -> numb > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return temp;
                
    }

}
