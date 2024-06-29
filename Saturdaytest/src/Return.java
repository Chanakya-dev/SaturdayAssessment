import java.util.Scanner;

public class Return {
    public int m1(int a ,int b){
        return a-b;
       
    }


    

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("account balance:");
        int a=sc.nextInt();
        System.out.println("withdrawal amount:");
        int b=sc.nextInt();

        Return r=new Return();
        int h=r.m1(a,b);
        if(a<b){
            System.out.println("Balance is insufficient");
    
        }
        else{
            System.out.println("avalible balance:");
        }

        System.out.println(h);

    }

    
}
