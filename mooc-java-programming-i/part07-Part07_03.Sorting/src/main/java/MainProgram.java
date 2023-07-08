import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    
    public static int smallest(int[] array){
        int temp = array[0];
        
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < temp){
                temp = array[i];
            }
        }
        
        return temp;
    }
    
    public static int indexOfSmallest(int[] array){
        int temp = array[0];
        int index = 0;

        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < temp){
                temp = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int temp = array[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++){
            if (array[i] < temp){
                temp = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap (int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort (int[] array){

        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp; 
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }

}
