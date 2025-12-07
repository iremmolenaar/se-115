import java.util.Scanner;

public class array_avarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] grades = new int [5][4];
        int sum = 0;
       for(int i=0;i<5;i++){
           for(int j=0;j<4;j++){
               System.out.println("Enter grade of student"+(i+1)+" for quiz"+(j+1)+": ");
               int grade = sc.nextInt();
               grades[i][j]=grade;
               sum+=grade;
           }
       } System.out.println("The avarge is"+sum/20);
    }
}
