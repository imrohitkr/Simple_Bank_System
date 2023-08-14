import java.util.Scanner;

public class bankSystem {
    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Welcome to the Bank of Java");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance is Rs." + balance);
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: Rs.");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("$" + amount + " has been deposited to your account.");
        checkBalance();
    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: Rs.");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
        }
        checkBalance();
    }

    public static void exit() {
        System.out.println("Thank you for banking with us. Have a great day!");
    }
}