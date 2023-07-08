
public class HealthStation {

    private int weightCounter = 0;

    public int weigh(Person person) {
        weightCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weight = person.getWeight();
        person.setWeight(++weight);
    }
    
    public int weighings(){
        return this.weightCounter;
    }

}
