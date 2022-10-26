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

void Telus(){
    System.out.println("Company name: Telus , Bank account: 938574 , Transfer number: 75846895");
}
void Bell(){
    System.out.println("Company name: Bell , Bank account: 938475 , Transfer number: 958395838");
}
void RogersCommunications(){
    System.out.println("Company name: Rogers Communications , Bank account: 756375 , Transfer number: 64963857");
}
}
