package SaturdayAssessment;

import java.util.Scanner;

public class Atm {
    int b;

    
    public void initBalance(int initialBalance) {
        b = initialBalance;
    }

    
    public void withdraw(int a) {
        if (a > b) {
            System.out.println("Insufficient balance");
        } else {
            b -= a;
            System.out.println("Withdrawal successful");
        }
    }

    
    public int getBalance() {
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Atm atm = new Atm();

        System.out.print("Enter  balance: ");
        int initialBalance = scanner.nextInt();
        atm.initBalance(initialBalance);

        
        System.out.print("Enter  amount: ");
        int withdrawalAmount = scanner.nextInt();

        
        atm.withdraw(withdrawalAmount);
        int z=atm.getBalance();

        
        System.out.println("Final balance is: " + z);
    }
}
