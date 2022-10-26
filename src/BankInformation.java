//Banking Information

public class BankInformation {

private String bankName;
private int bankCode;
private String streetAddress;
private String bankPhoneNumber;
private String bankEmail;
private String technicalSupportNumber;

public BankInformation() {
    this.bankCode = 03;
    this.bankName = "Bank Of Vancouver";
    this.streetAddress = "Online Banking";
    this.bankPhoneNumber = "(778)-574-5835";
    this.technicalSupportNumber = "(778)-586-8463";
    this.bankEmail = "BankOfVancouver@info.com";
}

public BankInformation(String bankName, int bankCode, String streetAddress, String bankPhoneNumber,String bankEmail) {
    this.bankName = bankName;
    this.bankCode = bankCode;
    this.streetAddress = streetAddress;
    this.bankPhoneNumber = bankPhoneNumber;
    this.bankEmail = bankEmail;

}

public String getBankName() {
    return bankName;
}

public int getBankCode() {
    return bankCode;
}

public String getStreetAddress() {
    return streetAddress;
}

public String getBankPhoneNumber() {
    return bankPhoneNumber;
}

public String getTechnicalSupportNumber() {
    return technicalSupportNumber;
}


@Override
public String toString() {
    return 
       "\nBank name: " + bankName 
     + "\nBank code: " + bankCode
     + "\nStreet address: " + streetAddress
     + "\nBank phone number: " + bankPhoneNumber
     + "\nBank Email: " + bankEmail
     + "\nTechnical support number " + technicalSupportNumber;
}






}