package Homework_ATM_FinalProject;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ATM_Transaction {

	// public static Scanner in;

	public static double balance;;// initial balance to 0 for everyone

	// public static int anotherTransaction;

	/*
	 * public static void main(String args[]) { //in = new Scanner(System.in); //
	 * call our transaction method here transaction(); }
	 */

	public static void transaction() {

		// here is where most of the work is

		System.out.println("Please select an option:");
		System.out.println("1. Withdraw Cash");
		System.out.println("2. Deposit FUnds");
		System.out.println("3. Check Balance");
		System.out.println("4. Transfer Funds");

		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();

		switch (choice) {
		case 1:
			float amount;
			System.out.println("Please enter amount to withdraw: ");
			amount = s.nextFloat();

			// thread for waiting 3 min for system to withdraw the money
			System.out.println("Waiting...The system is processing...");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}

			if (amount > balance || amount == 0) {
				System.out.println("You have insufficient funds\n\n");
				anotherTransaction(); // ask if they want another transaction
			} else {
				// they have some cash
				// update balance
				balance = balance - amount;
				System.out.println("You have withdrawn " + amount + " and your new balance is " + balance + "\n");
				anotherTransaction();
			}
			break;
		case 2:
			// option number 2 is depositing
			float deposit;
			System.out.println("Please enter amount you would wish to deposit: ");
			deposit = s.nextFloat();
			// update balance
			balance = deposit + balance;
			System.out.println("You have deposited " + deposit + " new balance is " + balance + "\n");
			anotherTransaction();
			break;

		case 3:

			// thread for waiting 2 min for system to show the current balance
			System.out.println("Waiting...The system is processing...");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}

			// this option is to check balance
			System.out.println("Your balance is " + balance + "\n");
			anotherTransaction();
			break;

		case 4:
			// option number 4 is Transfer Funds
			HashMap<String, String> BankCustomerCredentials = Service.getAllBankCustomerCredentials();

			List<BankCustomer> listNew = Service.getAllBankCustomers();

			float transferFunds;
			System.out.println("Please enter amount you would like to transfer: ");
			transferFunds = s.nextFloat();
			if (transferFunds > balance || transferFunds == 0) {
				System.out.println("You have insufficient funds\n\n");
				anotherTransaction(); // ask if they want another transaction
			} else {
				
				// update balance
				/*balance = balance - transferFunds - 15;
				System.out.println(
						"You have successfully transferred " + transferFunds + " with 15 transfer fee to this account "
								+ "transferAccount" + ".\n Your new balance is " + balance + ".\n");*/

				String transferAccount;
				System.out.println(
						"Please choose the recipient/bank account number you would like to transfer the money to: ");
				Scanner s1 = new Scanner(System.in);
				transferAccount = s1.nextLine();

				if (BankCustomerCredentials.containsKey(transferAccount)) {
					// Recognizing and printing the details of the BankCustomer with the Account
					// Number and Password from the Scanner
					System.out.println("\nBank Customer Details:");
					for (BankCustomer b : listNew) {
						if (b.getAccountNumber().contentEquals(transferAccount)) {
							// System.out.println(b);
							System.out.println("\nBank Account Number:" + b.getAccountNumber() + "\nName: "
									+ b.getFirstName() + "\nLast Name: " + b.getLastName()
									+ "\nBank Customer Balance is: " + b.getBalance());

							System.out.println();

							// need to write a line to deposit the money on the recipient account which are
							// already transfered
							float transferFunds1;
							System.out.println(
									"Please enter again the amount you would like to deposit on the recipients account: ");

							transferFunds1 = s1.nextFloat();
							double balance1 = b.getBalance() + transferFunds1;
							System.out.println("The Recipient bank account new balance is:" + balance1);
							System.out.println();
						}

					}

				} else {
					System.out
							.println("Incorrect recipient account number or the entered bank account does not exist. ");

				}
				
				// update balance
				balance = balance - transferFunds - 15;
				System.out.println(
						"You have successfully transferred " + transferFunds + " with 15 transfer fee to this account "
								+ transferAccount + ".\n Your new balance is " + balance + ".\n");

			}
			anotherTransaction();
			break;

		default:
			System.out.println("Invalid option:\n\n");
			anotherTransaction();
			break;
		}
	}

	public static void anotherTransaction() {
		System.out.println("Do you want another transaction?\nPress (1) for Main menu or press (2) for EXIT");
		Scanner s = new Scanner(System.in);
		int anotherTransaction = s.nextInt();
		if (anotherTransaction == 1) {
			transaction(); // call transaction method
		} else if (anotherTransaction == 2) {
			System.out.println("Thanks for choosing us. Good Bye!");
		} else {
			System.out.println("Invalid choice\n\n");
			anotherTransaction();
		}
	}
}
