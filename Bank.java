package SaturdayAssessment;
import java.util.Scanner;

public class Bank{
    int currentBalance = 1000;
    public static void greet(){
        System.out.println("Welcome to the banking System:");
    }
    public void deposit(int amount){
        currentBalance = currentBalance +amount;
        System.out.println("Amount deposited successfully: " );
    }
    public void withdrawl(int amount){
        currentBalance = currentBalance -amount;
        System.out.println("Amount withdrawn successfully: ");
    }
    public int getCurrentBalance(){
        return currentBalance;
    }
    public static void main(String[] args) {
        greet();
        Scanner sc = new Scanner(System.in);
        Bank b= new Bank();
        System.out.println("Enter amount to be deposited: ");
        int amount = sc.nextInt();
        b.deposit (amount);
        System.out.println("current balance:" + b.getCurrentBalance());
        System.out.println("Enter the amount to be withdrawn :");
        amount = sc.nextInt();
        b.withdrawl(amount);
        System.out.println("current balance:" + b.getCurrentBalance());
        
    }



}