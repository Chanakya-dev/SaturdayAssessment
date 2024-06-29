package SaturdayAssessment;
import java.util.Scanner;
;public class Atm{
    public static int Withdraw(int balance,int Withdraw){
        if(balance>=Withdraw){
            return balance-Withdraw;        }
            else{
                return -1;
            }
        }
    public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter balance: ");
            int balance=s.nextInt();
            System.out.println("Enter withdrawal amount");
            int withdraw=s.nextInt();
            int bal=Withdraw(balance,withdraw);
            System.out.println("Balance is"+bal);
        }    
    
}