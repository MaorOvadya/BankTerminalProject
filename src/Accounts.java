// Accounts information

public class Accounts {
    
    private int accountId;
    private String fullName;
    private String gender;
    private String userName;
    private String userPassword;
    private String joinDate;
    private String phoneNumber;
    private String email;
    
    public Accounts(int accountId, String fullName, String gender, String userName, String userPassword,String joinDate,String email,String phoneNumber) {
        this.joinDate = joinDate;
        this.accountId =  accountId;
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getAccountId() {
        return accountId;
    }


    public String getFullName() {
        return fullName;
    }


    public String getGender() {
        return gender;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        if(userName.length() >= 4 && userName.length() <= 8 && (userName.replaceAll(" ", "").equals(userName))) {
            return userName;
        } else {
        System.out.println("Invaild Username. Username must be between 4 to 8 digits/characters, No space");
        return null;
        }
    }

    public String getUserPassword() {
        if(userPassword.length() >= 6 && userPassword.length() <= 12 && (userPassword.replaceAll(" ", "").equals(userPassword))) {
            return userPassword;
        } else {
        System.out.println("Invaild password. Password must be between 6 to 12 digits/characters, No space");
        return null;
        }
    }

    // public void getUpdateEmail(){
    //     if()
    // }

    @Override
    public String toString() {
        return
          "\nJoin Date: " + joinDate
        + "\nFull Name: " + fullName 
        + "\nGender:" + gender
        + "\nContact:" 
        + "\nEmail: " + email
        + "\nPhone Number: " + phoneNumber;
    }

    

}
