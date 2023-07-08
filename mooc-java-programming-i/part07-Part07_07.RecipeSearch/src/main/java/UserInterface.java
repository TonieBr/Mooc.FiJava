import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private ArrayList<Recipe> recipes = new ArrayList<>();
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        
    }
    
    public void initialize(){
        System.out.println("File to read: ");
        String inputFile = this.scanner.nextLine();
        Scanner fileScanner = null;
        
        try {
        fileScanner = new Scanner(Paths.get(inputFile));
        
        int counter = 0;
        String name = null;
        int cookingTime = -1;
        ArrayList<String> ingredients = new ArrayList<>();

        do {
            String read = fileScanner.nextLine();

            if (read.equals("")){
                counter = 0;
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                this.recipes.add(recipe);
                ingredients = new ArrayList<>();
                continue;
            }

            if (counter == 0){
                name = read;
                counter++;
                continue;
            }

            if (counter == 1){
                cookingTime = Integer.valueOf(read);
                counter++;
                continue;
            }

                ingredients.add(read);

        } while (fileScanner.hasNextLine());

        Recipe recipeToAdd = new Recipe(name, cookingTime, ingredients);
        this.recipes.add(recipeToAdd);
        
        } catch (Exception e){
            e.getMessage();
        }
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipe by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    public void start(){
        
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("stop")){
                break;
            }
            
            // List Command
            if (input.equals("list")){
                for (Recipe recipe : this.recipes){
                    System.out.println(recipe);
                }
               
            }
            
            if (input.equals("find name")){
                System.out.println("Searched word: ");
                String toFind = scanner.nextLine();
                
                for (Recipe recipe : this.recipes){
                    if (recipe.getName().contains(toFind)){
                        System.out.println(recipe);
                    }
                }
            }
            
            if (input.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int toFind2 = Integer.valueOf(scanner.nextLine());
                
                for (Recipe recipe: this.recipes){
                    if (recipe.getCookingTime() <= toFind2){
                        System.out.println(recipe);
                    }
                }
            }
            
            if (input.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String toFind3 = scanner.nextLine();
                
                for (Recipe recipe : this.recipes){
                    if (recipe.getIngredients().contains(toFind3)){
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}
