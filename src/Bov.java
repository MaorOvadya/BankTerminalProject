import java.io.*;
import java.util.*;

public class Bov {
    public static void main(String[] args) throws Exception {

        // - initialize Accounts class
        ArrayList<Accounts> accounts = new ArrayList<>();
        accounts.add(new Accounts(5, "Maor ovadya", "Male", "maor", "123123", "4/5/2012", "maor@gmail.com",
                "778-958-4873", new Operations(7000), new PersonalBanker()));

        // - initialize CreditCard class
        ArrayList<Creditcards> creditcards = new ArrayList<>();
        creditcards.add(new Creditcards("Mastercard", "$119", "19.99%", "22.99%",null));
        creditcards.add(new Creditcards("Mastercard", "$0", "19.99%", "22.99%",null));
        creditcards.add(new Creditcards("Mastercard", "$20", "12.99%%", "12.99%%",null));

        // - initialize Loan class
        Loan loan = new Loan();

        // - initialize PayBill class
        PayBills payBills = new PayBills();

        // - initialize Bank information class
        BankInformation bankInformation = new BankInformation();


        // - initialize variables
        String password, userName,creditCard,loanCredit;
        char option,option2,option3,option4,option5,y,x;
        int amount;

        // - initialize Login screen
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.print("Login to your Account\n" + "Please enter your user name: ");
                userName = input.nextLine().replaceAll(" ", "").trim();
                System.out.print("Please enter your password: ");
                password = input.nextLine().replaceAll(" ", "").trim();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                if (userName.equals(accounts.get(0).getUserName()) && password.equals(accounts.get(0).getUserPassword())) {
                    System.out.print("Welcome " + accounts.get(0).getUserName() + ".");
                    break;
                } else {
                    System.out.println("Invaild Password or userName, please try again ");
                    System.out
                            .println("If you encounter a problem, contact technical support at 778-586-8463 toll free");
                    System.out.println("If you want to try again please type (Continue), to Quit type (Quit)");
                }
                if (input.nextLine().toLowerCase().equals("quit")) {
                    System.out.println("Thank you for using B.O.V " + accounts.get(0).getFullName() + " , Have pleasant day.");
                    System.exit(0);
                }
            }
            do { // DO-WHILE LOOP - menu screen
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("Menu selection" + "\nPlease type single character [A-Z] to select:");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("A: Bank information " + "\nB: Personal information" + "\nC: Account operations"
                        + "\nD: Personal Banker" + "\nE: Request" + "\nQ: Exit the system");

                option = input.next().charAt(0);
                switch (Character.toUpperCase(option)) { // FIRST SWITCH

                    case 'A':
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Bank information: " + bankInformation.toString());
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Back to menu type (M): ");
                        break;

                    case 'B':
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Personal Information: " + accounts.get(0).toString());
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Back to menu type (M): ");
                        break;

                    case 'C':
                        clrscr();
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Account Operations: ");
                        System.out.println("A: Get Balance: " + "\nB: Make a Deposit " + "\nC: Make a Withdraw "
                                + "\nD: Last Transaction " + "\nE: Pay Bills");

                        option2 = input.next().charAt(0);
                        switch (Character.toUpperCase(option2)) { // second switch

                            case 'A':
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Your balance is: " + accounts.get(0).getOperations().getBalance());
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Back to menu type (M): ");
                                break;

                            case 'B':
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.print("Please enter Amount you would like to deposit: ");
                                try {
                                    amount = input.nextInt();
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    accounts.get(0).getOperations().deposit(amount);
                                } catch (Exception e) {
                                    System.out.println("Erorr, invaild amount");
                                }
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Back to menu type (M): ");
                                break;

                            case 'C':
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.print("Please enter amount you would like to withdraw: ");

                                try {
                                    amount = input.nextInt();
                                    if (accounts.get(0).getOperations().getBalance() == 0) {
                                        System.out.println("Your balance: " + accounts.get(0).getOperations().getBalance()
                                                + ", No founds to withdraw");
                                    }
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    accounts.get(0).getOperations().Withdraw(amount);
                                } catch (Exception e) {
                                    System.out.println("Cannot withdraw amount, Please withdraw different amount");
                                }
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Back to menu type (M): ");
                                break;

                            case 'D':
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println(
                                        "Previous transaction: " + accounts.get(0).getOperations().previousTransaction());
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Back to menu type (M): ");
                                break;

                            case 'E': 
                                clrscr();
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Pay Bills: ");
                                System.out.println("A: Telus: " + "B: Bell " + " C: Rogers Communications ");

                                option3 = input.next().charAt(0);
                                switch (Character.toUpperCase(option3)) { // third switch

                                    case 'A':
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.print("Choose amount to pay: ");
                                        try {
                                            amount = input.nextInt();
                                            accounts.get(0).getOperations().payBill(amount);
                                            payBills.Telus();
                                        } catch (Exception e) {
                                            System.out.println("Erorr, invaild amount");
                                        }
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.println("Back to menu type (M): ");
                                        break;

                                    case 'B':
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.print("Choose amount to pay: ");
                                        try {
                                            amount = input.nextInt();
                                            accounts.get(0).getOperations().payBill(amount);
                                            payBills.Bell();
                                        } catch (Exception e) {
                                            System.out.println("Erorr, invaild amount");
                                        }
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.println("Back to menu type (M): ");
                                        break;

                                    case 'C':
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.print("Choose amount to pay: ");
                                        try {
                                            amount = input.nextInt();
                                            accounts.get(0).getOperations().payBill(amount);
                                            payBills.RogersCommunications();
                                        } catch (Exception e) {
                                            System.out.println("Erorr, invaild amount");
                                        }
                                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                                        System.out.println("Back to menu type (M): ");
                                        break;
                                } // END THIRD SWITCH

                        } // END SECOND SWITCH

                        break;

                    case 'D':
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println(accounts.get(0).getPersonalBanker());
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Back to menu type (M): ");
                        break;

                    case 'E':
                        clrscr();
                        System.out.println("<===*===*===*===*===*===*===*===*===>");
                        System.out.println("Account Operations: ");
                        System.out.println("A: Loan " + "\nB: Credit card " + "\nC: cheques ");

                        option4 = input.next().charAt(0);
                        switch (Character.toUpperCase(option4)) { // FOURTH SWITCH

                            case 'A':
                            clrscr();
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Loan is for 24 months ");
                                System.out.println("Choose the requested amount: ");
                                try {
                                    amount = input.nextInt();
                                    if (amount <= 150000 && amount >= 5000) {
                                        loan.interestRate(amount);
                                        System.out.println("To confirm request type [Y], to cancel request type [N]: ");
                                        creditCard = input.next();
                                        y = creditCard.toUpperCase().charAt(0);
                                        if (y == ('Y')) {
                                            System.out.println("You confirm, the transaction. the amount will transfer to your account in 48 hours.");
                                        } else if (y == ('N')) {
                                            System.out.println("You cancel the request, to make new request start the process again");
                                        }
                                    } else if (amount <= 0 && amount < 5000) {
                                        System.out.println("We sorry, B.O.V can't Loan amount less $5000 ");
                                    } else {
                                        System.out.println("Requested amount is more then $150,000. Please contact your personal banker");
                                    }
                                } catch (Exception e) {
                                    System.out.println("If you encounter a problem, contact your personal banker - "
                                            + accounts.get(0).getPersonalBanker().getFullName() + ", "
                                            + accounts.get(0).getPersonalBanker().getPhonWorkNumber());
                                } 
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Back to menu type (M): ");
                                break;
                            
                                case 'B':
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                System.out.println("Choose new Credit card: ");
                                System.out.println("A: BOV Cash Back Mastercard" + "\nB: BOV WestJet World Elite Mastercard" + "\nC: BOV Visa Classic Low Rate Option");
        
                                option5 = input.next().charAt(0);
                                switch (Character.toUpperCase(option5)) { // FIFTH SWITCH

                                    case 'A':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Card Details: " + creditcards.get(0).toString());
                                    System.out.println("To confirm order request type [Y], to cancel request type [N]: ");
                                    creditCard = input.next();
                                    y = creditCard.toUpperCase().charAt(0);
                                    if (y == ('Y')) {
                                        System.out.println("You confirm the order. you will recive email in 24 hours.");
                                    } else if (y == ('N')) {
                                        System.out.println("You cancel the request, to make new request start the process again");
                                    } 
                                    System.out.println("Back to menu type (M): ");
                                    break;

                                    case 'B':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Card Details: " + creditcards.get(1).toString());
                                    System.out.println("To confirm order request type [Y], to cancel request type [N]: ");
                                    creditCard = input.next();
                                    y = creditCard.toUpperCase().charAt(0);
                                    if (y == ('Y')) {
                                        System.out.println("You confirm the order. you will recive email in 24 hours.");
                                    } else if (y == ('N')) {
                                        System.out.println("You cancel the request, to make new request start the process again");
                                    } 
                                    System.out.println("Back to menu type (M): ");
                                    break;

                                    case 'C':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Card Details: " + creditcards.get(2).toString());
                                    System.out.println("To confirm order request type [Y], to cancel request type [N]: ");
                                    creditCard = input.next();
                                     y = creditCard.toUpperCase().charAt(0);
                                     if (y == ('Y')) {
                                        System.out.println("You confirm the order. you will recive email in 24 hours.");
                                    } else if (y == ('N')) {
                                        System.out.println("You cancel the request, to make new request start the process again");
                                    
                                    }
                                    System.out.println("Back to menu type (M): ");
                                    break;
                                } // END FIFTH SWICH
                                break;
                        }// END FOURTH SWITCH
                        break;

                    case 'Q':
                        System.out.println(accounts.get(0).getFullName() + " Thank you for using B.O.V, Have pleasant day.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invaild key, please try again, press back to menu (M): ");
                        break;
                } // END FIRST SWITCH

            } // EXIT DO-WHILE LOOP
            while (input.next().charAt(0) != 'Q');
            System.out.println(accounts.get(0).getFullName() + " Thank you for using B.O.V, Have pleasant day.");
            System.exit(0);
        }
    }

    public static void clrscr() {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
            System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {
        }
    }

}
