//Banking Information

public class BankInformation {

private String bankName;
private int bankCode;
private String streetAddress;
private String bankPhoneNumber;
private String technicalSupportNumber;

public BankInformation() {
    this.bankCode = 03;
    this.bankName = "Bank Of Vancouver";
    this.streetAddress = "Online Banking";
    this.bankPhoneNumber = "(778)-574-5835";
    this.technicalSupportNumber = "(778)-586-8463";
}

public BankInformation(String bankName, int bankCode, String streetAddress, String bankPhoneNumber) {
    this.bankName = bankName;
    this.bankCode = bankCode;
    this.streetAddress = streetAddress;
    this.bankPhoneNumber = bankPhoneNumber;

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
       "\nBank Name: " + bankName 
     + "\nBank Code: " + bankCode
     + "\nStreet Address: " + streetAddress
     + "\nBank Phone Number: " + bankPhoneNumber
     + "\nTechnical Support Number " + technicalSupportNumber;
}






}