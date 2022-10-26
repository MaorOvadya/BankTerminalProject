import java.util.*;

public class PayBills {
    
    private String companyName;
    private int bankaccount;
    private int transferNumber;

    public PayBills(){
        this.companyName = companyName;
        this. bankaccount = bankaccount;
        this.transferNumber = transferNumber;
    }

    public PayBills(String companyName,int bankaccount,int transferNumber ) {
        this.bankaccount = bankaccount;
        this.transferNumber = transferNumber;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getBankaccount() {
        return bankaccount;
    }

    public int getTransferNumber() {
        return transferNumber;
    }

void telus(){
    System.out.println("Company name: Telus , Bank account: 938574 , Transfer number: 75846895");
}
    
}
