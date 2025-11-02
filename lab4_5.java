import java.util.Scanner;

public class lab4_5 {

    public static String fizz_buzz(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            int mod15 = i % 15;
            int mod5 = i % 5;
            int mod3 = i % 3;

            switch (mod15) {
                case 0:
                    result += "FizzBuzz ";
                    break;
                default:
                    switch (mod5) {
                        case 0:
                            result += "Buzz ";
                            break;
                        default:
                            switch (mod3) {
                                case 0:
                                    result += "Fizz ";
                                    break;
                                default:
                                    result += i + " ";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String output = fizz_buzz(n);
        System.out.println(output);
    }
}
