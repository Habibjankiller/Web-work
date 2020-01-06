/*
 * I Built a simple ATM Machine incomplete just for check the User
 * But, The Program doesn't recognized me at all. So please Check it,
 * That am I doing programmatic error or logical error.
 * and also comments the founded problem so i further improved my java skill
 * Thanks
 * Regard: Habib Ullah
 */


import java.util.HashMap;
import java.util.Scanner;
public class ATM {
	public static void main(String args[]) {
		//Instantiation
		int option;
		String userInput;
		
		//HashMap for Storing Users
		HashMap<String, String> accounts = new HashMap<String, String>();
		accounts.put("Jamal", "jamal11226990");
		accounts.put("habib", "habib1122");
		
		//Looping through the program
		while(true) {
			
			//Printing Options
			System.out.println("Try The Below Option: ");
			System.out.println("1: Check Account");
			System.out.println("2: Add Account");
			System.out.println("3: Delete Account");
			
			//scanning option
			Scanner optionScanner = new Scanner(System.in);
			
			//Validating the Scan by checking the integer only
			if(!optionScanner.hasNextInt()) {
				System.out.println("Please Select Only Above Option");
			}else {
				//getting the menu option
				option = optionScanner.nextInt();
				
				//Check for the option 1
				if(option == 1) {
					
					//Scanning for the Username
					System.out.print("Enter username: ");
					Scanner userScanner = new Scanner(System.in);
					userInput = userScanner.nextLine();
					
					//Validating for username checking
					if(accounts.containsKey(userInput)) {
						
						//Getting Password
						System.out.print("Enter you password: ");
						Scanner passScanner = new Scanner(System.in);
						String passInput = passScanner.nextLine();
						/*
						 * The Problem can be founded here When i compare the input Password
						 */
						//Checking the password for the user they typed earlier
						if(accounts.get(userInput) == passInput) {
							System.out.println("You loggin Successfully");
						}else {
							System.out.println(passInput);
							System.out.println("You typed the wrong password");
						}
					}else {
						System.out.println("The username you typed doesn't exist");
					}
				}
			}
		}
	}
}
