import java.util.Random;
import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args){
        Random rg = new Random();
        int a = rg.nextInt(999);
        int b = rg.nextInt(999);
        float c = a/b;
        System.out.println("Randomly generated numbers are " + a + " and " + b);
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int m = -1;
        m = sc.nextInt();
        switch(m){
            case 1:
                System.out.println(a+b);
                break;
                case 2:
                    System.out.println(a-b);
                    break;
                    case 3:
                        System.out.println(a*b);
                        break;
                        case 4:
                            if (b==0) {
                                System.out.println("Division by zero is not allowed");
                            } else {
                                System.out.println(c);
                            }
                            break;

            
        }

    }
}
