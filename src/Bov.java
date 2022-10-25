import java.io.*;
import java.util.*;
public class Bov {
    public static void main(String[] args) throws Exception {

        Operations operations = new Operations();
        BankInformation bankInformation = new BankInformation();
        Accounts accounts = new Accounts(1, "Daiki moto", "Male", "koko", "123123","12/12/2021","daiki@gmail.com","123489343593");
        String password, userName;
        char option, option2;
        int amount;

        try (Scanner input = new Scanner(System.in)) {
            while(true) {
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.print("Login to your Account\n" + "Please enter your user name: ");
                userName = input.nextLine();
                System.out.print("Please enter your password: ");
                password = input.nextLine();
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    if (userName.equals(accounts.getUserName()) && password.equals(accounts.getUserPassword())){
                            System.out.print("Welcome " + accounts.getUserName() + ".");
                            break;
                        } else {
                            System.out.println("If you encounter a problem, contact technical support at 778-586-8463 toll free");
                            System.out.println("If you want to try again please type (Continue), to Quit type (Quit)");
                        }if (input.nextLine().toLowerCase().equals("quit")){
                            System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , Have pleasant day.");
                            System.exit(0);
                    }
            }   
                while (true) {
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("Menu selection" + "\nPlease type single character [A-Z] to select:");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("A: Bank information " + " B: Personal information" + " C: Account operations");

                option = input.next().charAt(0);
                clrscr();
                switch (Character.toUpperCase(option)) {

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
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Account Operations: ");
                    System.out.println("A: Get Balance:" + "B: Make a Deposit:" + " C: Make a Withdraw");
                        option2 = input.next().charAt(0);
                        switch (Character.toUpperCase(option2)){

                            case 'A':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Your balance is: " + operations.getBalance());
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.println("Back to menu type (M): ");
                            break;

                            case 'B':
                            System.out.println("<===*===*===*===*===*===*===*===*===>");
                            System.out.print("Please enter Amount you would like to deposit: ");
                            try{
                                 amount = input.nextInt();
                                operations.deposit(amount);
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
                                operations.Withdraw(amount);
                            }catch(Exception e){
                                System.out.println("Cannot withdraw amount, your currently balance: "  + operations.getBalance() + ", Please withdraw different amount");
                            }
                        }
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Back to menu type (M): ");
                    break;

                    default :
                    System.out.println("Invaild key, please try again, press back to menu (M): ");
                    break;
                }
                    if (Character.toUpperCase(option) != 'e');
                    System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , Have pleasant day.");
                    System.exit(0);
            } 
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


               // if (input.next().toUpperCase().charAt(0) != 'e'){
                //     System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , have pleasant day.");
                //     System.exit(0);
                // }