import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + i;
        }System.out.println("The sum of numbers from"+start+" to "+end+" is "+sum);
    }
}
