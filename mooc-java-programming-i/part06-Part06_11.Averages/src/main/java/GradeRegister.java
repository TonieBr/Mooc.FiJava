
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Double> examPoints = new ArrayList<>();

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add((double) points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
        
        if (grades.size() == 0){
            return -1;
        }
        
        int sum = 0;
        
        for (Integer grade : grades){
            sum += grade;
        }
        
        return 1.0 * sum / grades.size(); 
          
    }
    
    public double averageOfPoints(){
        if (examPoints.size() == 0){
            return -1;
        }
        
        double sum = 0;
        
        for (Double points : examPoints){
            sum += points;
        }
        
        return sum / examPoints.size();
    }
    
}
