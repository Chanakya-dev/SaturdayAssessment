import java.util.Scanner;

public class ATM 
{
    public int atm(int balance,int currentbalance,int withdrawal)
    {
        if(balance>=withdrawal) 
            System.out.println("Balnce is more than withdrawl amount");  
        else
            System.out.println("Insufficien Balance");

        return currentbalance;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the balance");
        int balance =sc.nextInt();

        System.out.println("Enter the amout to withdraw");
        int withdrawl=sc.nextInt();

        int a=balance-withdrawl;
        System.out.println(a);
    }
}
