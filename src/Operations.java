import java.util.*;
public class Operations {
    
    private int balance;
    private int deposit;
    private int withdraw;
    private int payBill;
    private int previousTransaction;
    private PayBills payBills;

    public Operations(){ // constructor
        this.balance = 0;
    }

    public Operations(int balance) { // constructor
        this.balance = balance;
    }
    
    public int getBalance() {
        return balance;
    }

    public PayBills getPayBills() {
        return payBills;
    }

    public int getPayBill() {
        return payBill;
    }

    public String previousTransaction(){
        if(previousTransaction > 0){
            return "You deposit: $" + previousTransaction;
        } else if (previousTransaction < 0) {
             return "You withdraw from your balance: $" + Math.abs(previousTransaction);
        } else {
            return "There no transactions";
        }
    }
    
    void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            previousTransaction += amount;
            System.out.println("you deposit amount: $" + amount + ", your currently update balance: "  + getBalance());

        } else {
            System.out.println("Invaild amount ");
        }
    }

    void Withdraw(int amount) {
        if(amount > 0 && balance > 0){
            if((amount <=balance) && (!(balance <0))) {
                balance -= amount;
                previousTransaction= -amount;
                System.out.println("you withdraw amount: $" + amount + ", your currently update balance: "  + getBalance());
            }else{
            if(amount <= 0){
            System.out.println("Cannot withdraw amount, your currently balance: "  + getBalance() + ", Please withdraw different amount");
            }
             System.out.println("Can't Withdraw this amount, your currently balance: " + balance); 
             }
         }
    }

    void payBill(int amount) {
        if((amount > 0 && balance > 0) && (amount <=balance) && (balance > 0)){
                balance -= amount;
               payBill = previousTransaction= -amount;
                System.out.println("you paid: $" + amount + ", your currently update balance: "  + getBalance());
            }
         else if (amount <= 0) { 
             System.out.println("Can't pay amount less or equal to 0, your currently balance: " + balance); 
            } 
    }    


}