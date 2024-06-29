package SaturdayAssessment;

import java.util.Scanner;

public class atm1 {
    double balance;
    double withdrawal; // Corrected variable name

    public double trans(double balance, double withdrawal) {
        if (balance >= withdrawal) {
            System.out.println("Transaction initiated");
            System.out.println("Transaction completed");
            double curbalance = balance - withdrawal;
            System.out.println("Current balance is: $" + curbalance);
            return curbalance;
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Transaction failed");
            System.out.println("Current balance is: $" + balance); // Display original balance
            return balance;
        }
    }

    public static void main(String[] args) {
        atm1 a = new atm1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance amount: ");
        double bal = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double wit = sc.nextDouble();

        double t = a.trans(bal, wit);
        System.out.println("Updated balance: $" + t);

        sc.close();
    }
}
