import java.util.Scanner;

public class BankAccount {
    private int accountID;
    private double balance;

    public BankAccount() {
        this.accountID = 0;
        this.balance = 0;
    }

    public BankAccount(int a, double b) {
        this.accountID = a;
        this.balance = b;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            System.out.println("Successfully deposited " + amt);
        }
    }


    public void withdraw(double amt) {
        if (this.balance >= amt) {
            this.balance -= amt;
            System.out.println("Successfully withdrawed " + amt);
        } else {
            System.out.println("Do you want to go into borrowing?");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                this.balance -= amt;
                System.out.println("Successfully withdrawed " + amt);
                System.out.println("New balance : " + this.balance);
            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Transaction rejected!");
            } else {
                System.out.println("INVALID CHOICE!");
            }
        }
    }

    public void accountDetails() {
        System.out.println(" AcountID: " + this.accountID);
        System.out.println("Balance: " + this.balance);
    }

    public void setAccountID(int a) {this.accountID = a;}
    public void setBalance(double b) {this.balance = b;}
    public int getAccountID() {return this.accountID;}
    public double getBalance() {return this.balance;}
}