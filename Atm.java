package SaturdayAssessment;
import java.util.Scanner;
public class Atm {

public double withdraw(double balance, double withdrawalAmount) {
    if (balance >= withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("Transaction successful! Expected balance: " + balance);
    } else {
        System.out.println("Insufficient balance.. Transaction failed.");
    }
return balance;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
   
    System.out.print("Enter your account balance: ");
    double balance = scanner.nextDouble();
    System.out.print("Enter the amount to withdraw: ");
    double withdrawalAmount = scanner.nextDouble();
    
    Atm atm = new Atm();
    
    balance = atm.withdraw(balance, withdrawalAmount);
    
  
}
}



