import java.util.Scanner;

public class saturday {
    public int m1( int m,int n) {
        return m-n;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balance");
        int m = sc.nextInt();

        System.out.println("Enter the withdraw");
        int n = sc.nextInt();
         
        saturday p1 = new saturday();
       int d= p1.m1(m,n);
        

        if(m<n) {
            System.out.println("insufficient balace");

        }
        else {
            System.out.println("Transaction successful");
        }
        System.out.println(d);


        
    }
}  


        




    
