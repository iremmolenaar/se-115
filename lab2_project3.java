import java.util.Scanner;

public class lab2_project3 {

    public static void main(String[] args) {
        System.out.println("How many kurus do you have?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/3;
        System.out.println(m/100 +" liras " + m%100 + " kurus per person");
    }
}
