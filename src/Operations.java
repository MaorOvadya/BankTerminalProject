public class Operations {
    
    private double balance;
    private Double deposit;
    private double withdraw;

    public Operations(){
        this.balance = 0;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public Operations(Double balance,Double deposit, double withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }

      void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invaild amount ");
        }
    }

    void Withdraw(int amount) {
        if(amount > 0 && balance > 0) {
            amount -= balance;
        } else {
            System.out.println("Invaild amount ");
        }
    }




}
