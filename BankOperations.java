package consoleProject;

public interface BankOperations {

	void credit();
	void debit();
	void previousTransaction();
	void displayDetails(Bank obj);
	Bank createAccount();
	void login(String userName, String password);
	void logout();
	//void searchAccount();
	void showBalance();
	
	default void securityMessage() {
		System.out.println("Dont share your otp and other important credentials to anyone bank will never ask for personal informations");
	}
}
