import java.util.Scanner;

public class lab2_project5 {
    public static void main(String[] args) {
        System.out.println("What are your quizz exam scores");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("What is your final exam scores?");
        Scanner sc2 = new Scanner(System.in);
        int q = sc2.nextInt();

        double a = (x + y + z) / 3.0 ;
        double b = a * 0.4 ;
        double c = q * 0.6 ;
        System.out.println("Your final grade is "+ (b+c));

    }
}
