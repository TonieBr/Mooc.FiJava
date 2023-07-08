
public class Statistics {
    
    private int count = 0;
    private int sum = 0;
    
    public Statistics(){
        this.count = 0;
    }
    
    public void addNumber(int number){
        count++;
        sum += number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        
        if (this.count == 0){
            return 0;
        }
        
        double average = 0;
        average = (double) this.sum / this.count;
        return average;
    }
    
    
}
