import java.util.Scanner;


interface ATM {
    void atm1();
}
 class atm2 implements ATM{
     int pin=2002;
    int Balance;
   public void atm1(){
       Scanner d=new Scanner(System.in);
       int enterpin=d.nextInt();
       System.out.println("enter the pin");
       if(pin==enterpin){
          main();
       }
       else
           System.out.println("pis is wrong");
   }
    public void main(){
        System.out.println("enter the option");
          System.out.println("1.check the balance");
           System.out.println("2.withdraw the money");
            System.out.println("3.deposit the money");
             System.out.println("4.exit");
             
             Scanner s=new Scanner(System.in);
             int x=s.nextInt();{
             if(x==1)
                checkBalance();
             else if(x==2)
                 withdrawMoney();
             else if(x==3)
                 depositMoney();
             else
                 exit();
    }
    }
    public void checkBalance(){
        System.out.println("balance="+Balance);
        
    }
    public void withdrawMoney(){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the money");
        int amount=a.nextInt();
        if(amount>Balance){
            System.out.println("insuffientmoney");
        }
        else
        {
            Balance=Balance-amount;
            System.out.println("withdrawSuccesful");
        main();}
    }
    public void depositMoney(){
        Scanner d=new Scanner(System.in);
        int amount=d.nextInt();
        Balance=amount+Balance;
        System.out.println("deposit successful");
        main();
    }
    public void exit(){
        System.out.println("transaction successfull");
    }

public static void main(String[]args){
      atm2 d=new atm2();
      d.atm1();
}
}
