package TransactionDetails;

public class Bankaccount {
    //Defiend Accountnumber field as private
    private String Accountnumber;
    //Defiend Balance field as private
    private double Balance;
    //defined constructor for parent class
    Bankaccount(String Accountnumber,double Balance){
        this.Accountnumber=Accountnumber; //assigned values to accountnumber field using this keyword

        this.Balance=Balance;//assigned values to balance field using this keyword

    }
    //Created methoad for deposite
    void deposite(){
        //added check for funds available to deposite
        if (Balance > 0)
            System.out.println("balance is added");
        else
            System.out.println("error");

    }
    //Created method for withdraw
    void withdraw(){
        //added check for funds available to withdraw
        if (Balance>0)
            System.out.println("we can withdraw amount");
        else
            System.out.println("insufficent balance");

    }

}
