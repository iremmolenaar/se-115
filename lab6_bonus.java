import java.util.Arrays;
import java.util.Random;

public class lab6_bonus {
    public static void main(String[] args) {
        int[][]studentsAndGrades = new int[6][5];
        Random rand = new Random();
        for (int i=1;i<6;i++) {
            for (int j=1;j<5;j++) {

                int grade = rand.nextInt(101);
                studentsAndGrades[i][j] = grade;
                System.out.println("student"+i+" grade is in quiz"+ j + " is "+ studentsAndGrades[i][j]);
            }
        }
    }
}

