package BankaccountException;


import TransactionDetails.Bankaccount;

public class main {
    public static void main(String[] args) {
        BankAccount details=new BankAccount(12345 , 1000.0);
        details.withdraw(500);
        BankAccount details1=new BankAccount(234,70);
        details1.withdraw(400);
    }
}
