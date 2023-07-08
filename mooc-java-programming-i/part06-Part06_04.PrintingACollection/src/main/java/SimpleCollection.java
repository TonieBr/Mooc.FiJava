
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        int counter = 0;
        String template = "";
        
        for (String element : elements){
            counter++;
            template = template + element + "\n";
        }
        
        template = template.trim();
        
        if (this.elements.size() == 0){
            return "The collection " + this.name + " is empty.";
        }
        
        if (this.elements.size() == 1){
        return "The collection " + this.name + " has " + counter + " element:\n" + template;     
        }
        
        return "The collection " + this.name + " has " + counter + " elements:\n" + template;
    }
    
}
