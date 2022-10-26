public class Creditcards {
    
    private String creditCardName;
    private String annualFee;
    private String purchaseRate;
    private String cashAdvanceRate;

    public Creditcards(){
        this.creditCardName = "Mastercard";
        this.annualFee = "$119";
        this.purchaseRate = "19.99%";
        this.cashAdvanceRate = "22.99%";
    }

    public Creditcards(String creditCardName, String annualFee, String purchaseRate, String cashAdvanceRate,
            String cardDetails) {
        this.creditCardName = creditCardName;
        this.annualFee = annualFee;
        this.purchaseRate = purchaseRate;
        this.cashAdvanceRate = cashAdvanceRate;

    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public String getAnnualFee() {
        return annualFee;
    }

    public String getPurchaseRate() {
        return purchaseRate;
    }

    public String getCashAdvanceRate() {
        return cashAdvanceRate;
    }



    @Override
    public String toString() {
        return "\nCard Name: " + creditCardName
                + "\nAnnual Fee: " + annualFee 
                + "\nPurchase Rate: " + purchaseRate 
                + "\nCash Advance Rate: " + cashAdvanceRate;
    }


    
}
