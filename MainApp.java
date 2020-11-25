package Homework_ATM_FinalProject;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MainApp {

	// account number = 00452195
	// password = 4519

	public static void main(String[] args) {

		HashMap<String, String> BankCustomerCredentials = Service.getAllBankCustomerCredentials();

		List<BankCustomer> listNew = Service.getAllBankCustomers();
		// System.out.println(listNew);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number: ");
		String accountNum = s.nextLine();

		if (BankCustomerCredentials.containsKey(accountNum)) {
			System.out.println("Enter password: ");
			String password = s.nextLine();
			if (BankCustomerCredentials.get(accountNum).equals(password)) {
				System.out.println("You have successfully signed in! ");

				// Recognizing and printing the details of the BankCustomer with the Account
				// Number and Password from the Scanner
				System.out.println("\nBank Customer Details:");
				for (BankCustomer b : listNew) {
					if (b.getAccountNumber().contentEquals(accountNum)) {
						//System.out.println(b);
						System.out.println("\nBank Account Number:" + b.getAccountNumber() + "\nName: "
								+ b.getFirstName() + "\nLast Name: " + b.getLastName() + "\nDay of Birth: "
								+ b.getDayOfBirth() +  "\nEmail: " + b.getEmail() + "\nPhone Number: " + b.getPhone()
								+ "\nBank Customer Balance is: " + b.getBalance());

						System.out.println();

						double balance = b.getBalance();
						// System.out.println(balance);

						// creating object from class ATM_Transaction
						 ATM_Transaction obj = new ATM_Transaction();
				         obj.balance = balance;  // take the value of variable balance from Main method amd Class to set it to the balance variable in the ATM_Transaction Class
						 
						 obj.transaction();
					}
					// System.out.println(b.getBalance());
					// balance = b.getBalance;
					// Starting to execute transaction methof for balance, Deposit Funds, Withdraw
					// funds...
				}
			} else {
				System.out.println("Incorrect username or password ");
			}

		}
	}
}
