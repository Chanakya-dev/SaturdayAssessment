package SaturdayAssessment;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        atm bank=new atm();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your the balance amount");
        int balance =sc.nextInt();
        System.out.println("Enter the amount to withdraw");
        int a=sc.nextInt();
        bank.withdraw(a,balance);
       int totalbalance = bank.currentbalance(a,balance);
       System.out.println(totalbalance);

    }
    public void withdraw( int a,int balance){
        balance = balance - a;
        if(a>balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Withdrawed Successfully");
        }
    }
    public  int currentbalance (int a, int balance){
        return balance;
    }


        
        }
