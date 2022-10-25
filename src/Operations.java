public class Operations {
    
    private int balance;
    private int deposit;
    private int withdraw;
    private int transactions;
    private int previousTransaction;


    public Operations(){ // constructor
        this.balance = 0;
    }

    public Operations(int balance) { // constructor
        this.balance = balance;
    }
    
    public int getBalance() {
        return balance;
    }

     public int getTransactions() {
        return transactions;
    }

    public String previousTransaction(){
        if(previousTransaction > 0){
            return "You deposit: $" + previousTransaction;
        } else if (previousTransaction < 0) {
             return "You withdraw: $" + Math.abs(previousTransaction);
        } else {
            return "There no transactions";
        }
    }
    
    void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            transactions ++;
            previousTransaction += amount;
            System.out.println("you deposit amount: $" + amount + ", your currently balance: "  + getBalance());

        } else {
            System.out.println("Invaild amount ");
        }
    }

    void Withdraw(int amount) {
        if(amount > 0 && balance > 0){
            if((amount <=balance) && (!(balance <0))) {
                balance -= amount;
                transactions ++;
                previousTransaction= -amount;
                System.out.println("you withdraw amount: $" + amount + ", your currently balance: "  + getBalance());
            }else{
            if(amount <= 0){
            System.out.println("Cannot withdraw amount, your currently balance: "  + getBalance() + ", Please withdraw different amount");
            }
             System.out.println("Can't Withdraw this amount, your current balance is: " + balance); 
             }
         }
    }
}