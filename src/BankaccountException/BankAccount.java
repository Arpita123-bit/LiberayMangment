package BankaccountException;

public class BankAccount {
   private int accountnumber;
   private double  balance;

    public BankAccount(int accountnumber, double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
   public void deposite(double amount){
    // if(amount > 0){
       try {
           System.out.println(balance += amount);

       } catch (Exception e){
           System.out.println(e.getMessage());
       }



   }


   public void withdraw(double amount){
        try{
            if (amount > balance){
                throw new IllegalArgumentException("Insficiant balance for withdraw");
            } else if (amount <= 0) {
                throw new IllegalArgumentException("Amount enterd is invaild");

            }else{
                balance -= amount;
                System.out.println( "Avilable balance " + balance );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
       System.out.println("YOU WANTED A SLIP");

   }
}
