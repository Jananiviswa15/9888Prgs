package consoleProject;

import java.util.Scanner;

public class Bank implements BankOperations{

	private int accountNum;
	private String userName;
	private int balance;
	private int  lastTransaction;
	private String password; 
	private static final Scanner scan = new Scanner(System.in);

	Bank(){}
	Bank(String userName, int balance, int accountNum){
		this.userName = userName;
		this.balance = balance;
		this.accountNum = accountNum;
		
	}
	public void credit() {
		System.out.println(" Enter the amount you want to credit");
		int creditAmnt = scan.nextInt();
		if(creditAmnt > 0) {
			balance += creditAmnt;
			lastTransaction = creditAmnt;  //500
		}
		else
			System.out.println("enter proper value...");
		showBalance();

	}

	public Bank createAccount() {
		System.out.println("Enter your name..");
		String name = scan.next();
		System.out.println("Enter your initial deposit amnt..");
		int amnt = scan.nextInt();
		System.out.println("ENter your acc num");
		int accNum = scan.nextInt();
        return	new Bank(name, amnt, accNum);
	}
	public void displayDetails(Bank customer) {
		final String displayMessage = customer.userName+" "+ customer.accountNum +" " +customer.balance;
		System.out.println(displayMessage);
	}
	public void showBalance() {
		System.out.println("Current balance is :"+balance);
	}

	public void previousTransaction() {
		final String message = "The last transaction is";
		if(lastTransaction > 0 ) 
			System.out.println(message+"CREDIT for an amount of"+ lastTransaction);
		else
			System.out.println(message+"DEBIT for an amount of"+ lastTransaction);
	}

	public void debit() {
		System.out.println(" Enter the amount you want to debit");
		int debitAmnt = scan.nextInt();
		if(debitAmnt > 0 && balance >= debitAmnt ) {
			balance -= debitAmnt;
			lastTransaction = -debitAmnt;  //-200
		}
		else
			System.out.println("enter proper value...");
		showBalance();
	}

	public	void login(String userName, String password) {
		if(userName.equals("Janani") && password.equals("hello")) 
			System.out.println("=====Logged in successfully....======");
		else
			System.out.println("Enter correct username and password");
		DriverClass.showMenu();
	}
	public void logout() {
		System.out.println("kindly rate us to serve you better");
		securityMessage();
	}
}
