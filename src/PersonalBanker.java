public class PersonalBanker {
    
private String fullName;
private String email;
private String phonWorkNumber;
private String availability;
private String department;

public PersonalBanker(){
    this.fullName = "George Colin";
    this.email = "georgeC@bov.com";
    this.phonWorkNumber = "778-463-5998";
    this.availability = "Week Days 8AM - 8PM, Weekends - Not Active";
    this.department = "Personal banking - online banking";
}

public PersonalBanker(String fullName, String email, String phonWorkNumber, String availability,String department) {
    this.fullName = fullName;
    this.email = email;
    this.phonWorkNumber = phonWorkNumber;
    this.availability = availability;
    this.department = department;
}

public String getFullName() {
    return fullName;
}

public String getEmail() {
    return email;
}

public String getPhonWorkNumber() {
    return phonWorkNumber;
}

public String getAvailability() {
    return availability;
}

public String getDepartment() {
    return department;
}

@Override
public String toString() {
    return "Personal Banker: " 
    + "\nDepartment: " + department
    + "\nFull name: " + fullName
    + "\nWork phone number: " + phonWorkNumber
    + "\nEmail: " + email
    + "\navailability: " + availability;
}


}
