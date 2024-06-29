package SaturdayAssessment;

import java.util.Scanner;

public class Atm {
    int balance;

    
    public void initBalance(int initialBalance) {
        balance = initialBalance;
    }

    
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }

    
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Atm atm = new Atm();

        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        atm.initBalance(initialBalance);

        
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        
        atm.withdraw(withdrawalAmount);
        int z=atm.getBalance();

        
        System.out.println("Final balance is: " + z);
    }
}
