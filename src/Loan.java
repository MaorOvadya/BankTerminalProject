public class Loan {

    private double interestRate;
    private int requestedAmount;

    public Loan(){

    }

    public Loan(double interestRate, int requestedAmount) {
        this.interestRate = interestRate;
        this.requestedAmount = requestedAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }
    
    double monthlyPay(double monthlyPay){
        return monthlyPay = ( interestRate * interestRate) / 100;
    }

    void interestRate(int amount){
        double monthlyPay;
        if (amount >= 5000 && amount <= 50000) {
            interestRate = 4.65;
            System.out.println("You apply for: $" + amount + " in monthly rate: " + interestRate 
            + " your payment will be each month for max 24 months: $" + String.format("%.2f",monthlyPay = Math.floor((amount * interestRate) / 100) /24));
         } else if (amount > 50000 && amount <= 100000) {
            interestRate = 5.76;
            System.out.println("You apply for: $" + amount + " in monthly rate: " + interestRate 
            + " your payment will be each month for max 24 months: $" + String.format("%.2f",monthlyPay = Math.floor((amount * interestRate) / 100) /24));
        } else if (amount > 100000 && amount <= 150000) {
            interestRate = 6.45;
            System.out.println("You apply for: $" + amount + " in monthly rate: " + interestRate 
            + " your payment will be each month for 24 months: $" + String.format("%.2f",monthlyPay = Math.floor((amount * interestRate) / 100) /24));
         } else if (amount <= 0){
            System.out.println("Can't request 0 or negetive amount!");     
         } else if (amount <=0 && amount < 5000){
            System.out.println("We sorry, B.O.V can't Loan amount less $5000 ");
        }
        // System.out.println("Requested amount is more then $150,000. Please contact your personal banker");
    }
}