package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n Banking Application ");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> checkBalance();
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.add(new BankAccount(accNo, name, balance));
        System.out.println("Account created successfully!");
    }

    static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo) {
                System.out.print("Enter Amount to Deposit: ");
                double amount = sc.nextDouble();
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo) {
                System.out.print("Enter Amount to Withdraw: ");
                double amount = sc.nextDouble();
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo) {
                acc.display();
                return;
            }
        }
        System.out.println("Account not found!");
    }
}
