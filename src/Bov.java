import java.io.*;
import java.util.*;
public class Bov {
    public static void main(String[] args) throws Exception {

        // - initialize PayBill class    
        PayBills payBills = new PayBills();       
 
        // - initialize Bank information class           
        BankInformation bankInformation = new BankInformation();

        // - initialize Accounts class           
        Accounts accounts = new Accounts(1, "Jhon doe", "Male", "jhon", "123123","12/12/2021","daiki@gmail.com","778 432 4354",new Operations(100));

        // - initialize variables
        String password, userName;
        char option,option2,option3;
        int amount;

        // -  initialize Login screen
        try (Scanner input = new Scanner(System.in)) {
            while(true) {
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.print("Login to your Account\n" + "Please enter your user name: ");
                userName = input.nextLine().replaceAll(" ", "").trim();
                System.out.print("Please enter your password: ");
                password = input.nextLine().replaceAll(" ", "").trim();
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    if (userName.equals(accounts.getUserName()) && password.equals(accounts.getUserPassword())){
                            System.out.print("Welcome " + accounts.getUserName() + ".");
                            break;
                        } else {
                            System.out.println("Invaild Password or userName, please try again ");
                            System.out.println("If you encounter a problem, contact technical support at 778-586-8463 toll free");
                            System.out.println("If you want to try again please type (Continue), to Quit type (Quit)");
                        }if (input.nextLine().toLowerCase().equals("quit")){
                            System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , Have pleasant day.");
                            System.exit(0);
                    }
                } 
                do { // DO-WHILE LOOP - menu screen
                    clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("Menu selection" + "\nPlease type single character [A-Z] to select:");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("A: Bank information " + "\nB: Personal information" + "\nC:Account operations");
                System.out.println("E: Exit the system");

                option = input.next().charAt(0);
                switch (Character.toUpperCase(option)) { // FIRST SWITCH

                    case 'A':
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Bank information: " + bankInformation.toString() );
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Back to menu type (M): ");
                    break; 
        
                    case 'B':
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Personal Information: " + accounts.toString());
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
                        switch (Character.toUpperCase(option2)){ // second switch

                            case 'A':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Your balance is: " + accounts.getOperations().getBalance());
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Back to menu type (M): ");
                            break;

                            case 'B':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.print("Please enter Amount you would like to deposit: ");
                            try{
                                amount = input.nextInt();
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                accounts.getOperations().deposit(amount);
                            }catch(Exception e){
                                System.out.println("Erorr, invaild amount");
                            }
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Back to menu type (M): ");
                            break;

                            case 'C':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.print("Please enter amount you would like to withdraw: ");
                            
                            try{
                                amount = input.nextInt();
                                if(accounts.getOperations().getBalance() == 0){
                                    System.out.println("Your balance: " + accounts.getOperations().getBalance() + ", No founds to withdraw");
                                }
                                System.out.println("<===*===*===*===*===*===*===*===*===>");
                                accounts.getOperations().Withdraw(amount);
                            }catch(Exception e){
                                System.out.println("Cannot withdraw amount, Please withdraw different amount");
                            }
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Back to menu type (M): ");
                            break;
                        
                            case 'D':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Previous transaction: "  +  accounts.getOperations().previousTransaction());
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Back to menu type (M): ");
                            break;

                            case 'E':
                            clrscr();
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Pay Bills: ");
                            System.out.println("A: Telus: " + "B: Bell " + " C: Rogers Communications ");
        
                                option3 = input.next().charAt(0);
                                switch (Character.toUpperCase(option3)){ // second switch
        
                                    case 'A':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.print("Choose amount to pay: ");
                                    try{
                                        amount = input.nextInt();
                                        payBills.Telus();
                                    }catch(Exception e){
                                       System.out.println("Erorr, invaild amount");
                                   }
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Back to menu type (M): ");
                                    break;
                                
                                    case 'B':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.print("Choose amount to pay: ");
                                    try{
                                        amount = input.nextInt();
                                        accounts.getOperations().payBill(amount);
                                        payBills.Bell();
                                  }catch(Exception e){
                                    System.out.println("Erorr, invaild amount");
                                 }
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Back to menu type (M): ");
                                    break;

                                    case 'C':
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.print("Choose amount to pay: ");
                                    try{
                                        amount = input.nextInt();
                                        accounts.getOperations().payBill(amount);
                                        payBills.RogersCommunications();
                                  }catch(Exception e){
                                    System.out.println("Erorr, invaild amount");
                                 }
                                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                                    System.out.println("Back to menu type (M): ");
                                    break;
                                }
                        } // END SECOND SWITCH

                        break;

                        case 'E':
                        System.out.println(accounts.getFullName() + " Thank you for using B.O.V, Have pleasant day.");
                        System.exit(0);
                        break;

                        default :
                        System.out.println("Invaild key, please try again, press back to menu (M): ");
                        break;
                    } // END FIRST SWITCH

                } // EXIT DO-WHILE LOOP
                while(input.next().charAt(0) != 'E');
                System.out.println(accounts.getFullName() + " Thank you for using B.O.V, Have pleasant day.");
                System.exit(0); 
                }
            }
    


    public static void clrscr(){
		// Clears Screen in java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}

    
}
