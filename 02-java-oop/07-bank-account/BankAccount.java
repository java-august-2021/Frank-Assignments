import java.util.Random;
public class BankAccount {
    private String accountNumber;
    // private double amount=0;
    private String holderFullname;
    private double checkingBalance;
    private double savingsBalance;

    public static int  noOfAccount=0;
    public static double totalAmount=0;

    public BankAccount(String accountNum){
        this.accountNumber=accountNum;
        noOfAccount+=1;
    }

    public void accountDetail(){
        System.out.printf("your Account number is: %s and there is %d \n ",this.accountNumber,noOfAccount);
    }

    public void getCheckingBalance(){
        System.out.printf("You have %,.2f in your Checking Account \n",this.checkingBalance); 
    }

    public void getSavingBalance(){
        System.out.printf("You have %,.2f in your Saving Account \n",this.savingsBalance); 
    }

    public void getTotal(){
        System.out.printf("Your Total Amount in your Checking And Saving Account is %,.2f \n",totalAmount);
    }

    public void deposit(int amount, String accType){
        if (accType.equals("checking")){
            this.checkingBalance+=amount;
        }
        else if(accType.equals("saving")){
            this.savingsBalance+=amount;
        }
        else{
            System.out.println("Account Type must be either checking or saving \n");
        }
        totalAmount=this.checkingBalance+this.savingsBalance;
    }

    public void withdrow(int amount, String accType){
        if (accType.equals("checking") && this.checkingBalance>amount){
            this.checkingBalance-=amount;
        }
        else if(accType.equals("saving") && this.savingsBalance > amount){
            this.savingsBalance-=amount;
        }
        else{
            System.out.println("Account Type are checking and saving or you have insufficient funds ");
        }
    }
}
