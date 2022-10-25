import java.io.*;
import java.util.*;
public class Bov {
    public static void main(String[] args) throws Exception {
    
        Accounts accounts = new Accounts(1, "Daiki moto", "Male", "koko", "123123","12/12/2021",new BankInformation(),"daiki@gmail.com","123489343593");
        BankInformation bankInformation = new BankInformation();
        String password, userName;
        char option;

        try (Scanner input = new Scanner(System.in)) {
            while(true) {
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.print("Login to your Account\n" + "Please enter your user name:\n ");
                userName = input.nextLine();
                System.out.println("Please enter your password: ");
                password = input.nextLine();
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    if (userName.equals(accounts.getUserName()) && password.equals(accounts.getUserPassword())){
                            System.out.print("Welcome " + accounts.getUserName() + ".");
                            break;
                        } else {
                            System.out.println("If you encounter a problem, contact technical support at 778-586-8463 toll free");
                            System.out.println("If you want to try again please type (Continue), to Quit type (Quit)");
                        }if (input.nextLine().toLowerCase().equals("quit")){
                            System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , have pleasant day.");
                            System.exit(0);
                    }
            }   

            do { 
                clrscr();
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("Welcome to BOV - Bank Of Vancouver");
                System.out.println("Menu Selection" + "\nPlease Type Single Character [A-Z] to Select:");
                System.out.println("<===*===*===*===*===*===*===*===*===>");
                System.out.println("A: Bank Information" + " B: Personal Information");
        
                
                option = input.next().charAt(0);
                switch (Character.toUpperCase(option)) {
        
                    case 'A':
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Bank information: " + bankInformation.toString() );
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Back to Menu Type (continue): ");
                    break; 
        
                    case 'B':
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                    System.out.println("Personal Information: " + accounts.toString());
                    System.out.println("<===*===*===*===*===*===*===*===*===>");
                }
                while (Character.toLowerCase(option) != 'e'){
                    System.out.println("Thank you for using B.O.V " + accounts.getFullName() + " , have pleasant day.");
                    System.exit(0);
                }
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
