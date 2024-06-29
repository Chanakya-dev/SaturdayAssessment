package SaturdayAssessment;

public class ATM {
    
        int  a=100;
      public static void main(String[] args) {
    
          ATM p=new ATM();
    
          System.out.println(p.a);
          p.a=400;
          System.out.println("with draw"+p.a);
          ATM kk=new ATM();
           
          System.out.println(kk.a-p.a+"remainiong amount");
          if (p.a>kk.a){
            System.out.println("not procced transaction");
          }
          else if(p.a==kk.a && p.a<kk.a){
            System.out.println("procced transactio");
    
          }
          
          }
      }
    
    
    
