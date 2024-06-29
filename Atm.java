package ThursdayTest;
import java.util.Scanner;

class Kamal {
    int balance, withdrawamount;

    int get() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter balance:");
        balance = s.nextInt();
        System.out.println("Enter withdraw amount:");
        withdrawamount = s.nextInt();

        if (balance > withdrawamount) {
            System.out.println("Withdraw succesful, Your balance is: " + (balance - withdrawamount));
        } else {
            System.out.println("Insufficient funds");
        }
        return balance;
    }
    
}

public class Atm {
    public static void main(String[] args) {
        Kamal o = new Kamal();
        o.get();
    }
}
