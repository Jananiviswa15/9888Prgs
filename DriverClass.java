package consoleProject;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass {
	private static final Scanner scan = new Scanner(System.in);
	private static final Bank bankObj = new Bank();
	static void showMenu() {
		System.out.println("Press 1 to login");
		System.out.println("Press 2 to credit");
		System.out.println("Press 3 to debit");
		System.out.println("Press 4 to show balance");
		System.out.println("Press 5 to view last transaction");
		System.out.println("Press 6 to create account");
		System.out.println("Press 7 to search account");
		System.out.println("Press 8 to logout");
		System.out.println("Press 9 to exit");
		System.out.println("Press 10 to display all our customers..");
	}

	public static void main(String args[]) {
		showMenu();
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		int option;
		do {
			System.out.print("=====Enter your option=====");
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter the username");
				String name = scan.next();
				System.out.println("Enter the password");
				String password = scan.next();
				bankObj.login(name, password);
				break;
			case 2:
				bankObj.credit();
				break;
			case 3: 
				bankObj.debit();
				break;
			case 4:	
				bankObj.showBalance();
				break;
			case 5:
				bankObj.previousTransaction();
				break;
			case 8:
				bankObj.logout();
				break;
			case 10:
				System.out.println("Enter your designation..");
				String designation = scan.next();
				System.out.println("Enter your passcode..");
				int passcode = scan.nextInt();
				//read designation // accept passcode
				if(designation.equalsIgnoreCase("manager") && passcode == 123) {
					System.out.println("welcome manager...");
					for(int ctr = 0; ctr < bankList.size(); ctr++)
						bankObj.displayDetails(bankList.get(ctr));
					break;
				}
			case 6:
				Bank newCustomer =  bankObj.createAccount();
				bankList.add(newCustomer);
				break;
			default :
				if(option != 9)
					System.out.println("Enter proper options...");
			}
		}
		while(option != 9);
	}
}
