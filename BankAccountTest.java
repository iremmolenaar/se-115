import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        BankAccount Account1 = new BankAccount(101, 500.0);

        BankAccount Account2 = new BankAccount(102 , 700.0);

        BankAccountTest app = new BankAccountTest();

        app.runMenu(Account1);

    }

    public void runMenu(BankAccount user) {
        Scanner sc = new Scanner(System.in);
        int choice;

        boolean exit = false;

        while (!exit) {
            System.out.println("What do you want to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Details");
            System.out.println("4. Exit");
            System.out.print("5. Change account ID ");
            int input = sc.nextInt();


            if (input < 6 || input > 0) {
                choice = input;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:

                    System.out.println("Enter amount to be deposited");
                    double a = sc.nextDouble();
                    user.deposit(a);
                    break;
                case 2:
                    System.out.println("How much do you want to withdraw?");
                    double b = sc.nextDouble();
                    user.withdraw(b);
                    break;
                case 3:
                    user.accountDetails();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    exit = true;
                    break;
                    case 5:
                        System.out.println("What would you like to change your id to?");
                        int new_id = sc.nextInt();
                        System.out.println("Your old id was: "+ user.getAccountID());
                        user.setAccountID(new_id);
                        System.out.println("Your new id was: "+ user.getAccountID());
                        break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

