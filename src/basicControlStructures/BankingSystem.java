package basicControlStructures;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBankingActive = true;
        double balance = 0;
        System.out.println("Welcome to the XYZ Banking System!");

        while (isBankingActive) {
            System.out.println("------------------------------\n" +
                    "Please choose an option:\n" +
                    "1 Check Balance\n" +
                    "2 Deposit Money\n" +
                    "3 Withdraw Money\n" +
                    "4 Exit");

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println(depositAmount + " has been deposited to your account.");
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextInt();
                    if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println(withdrawAmount + " has been withdrawn from your account.");
                    } else {
                        System.out.println("Withdrawal failed: Insufficient funds.");
                    }
                    break;
                case 4:
                    isBankingActive = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}