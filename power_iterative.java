import java.util.Scanner;

public class power_iterative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a base");
        int base = sc.nextInt();
        System.out.println("enter a power");
        int power = sc.nextInt();
        int number=1;
        for(int i=0;i<power;i++){
            number = number*base;
        }
        System.out.println(number);
    }
}
