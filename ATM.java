import java.util.Scanner;

public class ATM {
    public static void main(String args[] ){ 
        Scanner money = new Scanner(System.in);
        int balance = 25000, withdrawal;

        while(true){

            System.out.println("Enter 1 for Withdrawal");
            System.out.println("Enter 2 for Check yourBalance");

            int option = money.nextInt();

            switch(option){
                case 1:
                System.out.println("Enter the amount you want to draw: ");
                //int withdrawal = money.nextInt();
                withdrawal = money.nextInt();

                if(balance >= withdrawal){
                    System.out.println("Please collect your cash");
                }
                else{
                    System.out.println("You dont have enough Balance");
                }
                break;
 
 
                case 2:
                System.out.println("Your Balance is : "+ balance);
                break;
 
            }
        }
    }
    
}
