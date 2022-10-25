public class Operations {
    
    private int balance;
    private int deposit;
    private int withdraw;

    public Operations(){
        this.balance = 0;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Operations(int balance,int deposit, int withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }

      void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("you deposit amount: " + amount + ", your currently balance: "  + getBalance());

        } else {
            System.out.println("Invaild amount ");
        }
    }

    void Withdraw(int amount) {
        if(amount > 0 && balance > 0){
            if((amount <=balance) && (!(balance <0))) {
                balance -= amount;
                System.out.println("you withdraw amount: " + amount + ", your currently balance: "  + getBalance());
            }else{
            if(amount <= 0){
            System.out.println("Cannot withdraw amount, your currently balance: "  + getBalance() + ", Please withdraw different amount");
            }
             System.out.println("Can't Withdraw this amount, your current balance is: " + balance); 
             }
         }
    }
}