import java.util.Scanner;

public class atm{
    public double  m1(double balance,double withdraw) {
        if (balance > withdraw) {
            System.out.println("transaction sucessful");
        }

    return balance ;
    }
public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    System.out.println("Enter your balance");
    double  balance = in .nextDouble();
    Scanner hi = new Scanner(System.in);
    System.out .println("enter the withdraw amount");
    double  withdraw = hi .nextDouble();
    atm obj = new atm();
    obj.m1(balance,withdraw);
}


}