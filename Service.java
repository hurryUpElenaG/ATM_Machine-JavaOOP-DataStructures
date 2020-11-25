package Homework_ATM_FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class Service {

	// creating list of BankCustomers
	public static List<BankCustomer> getAllBankCustomers() {
		List<BankCustomer> list = new ArrayList<BankCustomer>();
		BankCustomer b1 = new BankCustomer();
		b1.firstName = "Jovan";
		b1.lastName = "Petrov";
		b1.accountNumber = "00896521";
		b1.password = "9876";
		b1.dayOfBirth = "20.05.1995";
		b1.email = "jovan_p@gmail.com";
		b1.phone = 070453707;
		b1.balance = 20000.00;
		list.add(b1);

		BankCustomer b2 = new BankCustomer("Christian", "Filipov", "00987435", "7543", "09.04.1998",
				"christian_f@gmail.com", 071231443, 12000.00);
		list.add(b2);

		BankCustomer b3 = new BankCustomer("Toni", "Ilievski", "00452195", "4519", "02.08.1997", "toni_i@gmail.com",
				072231747, 15000.00);
		list.add(b3);

		BankCustomer b4 = new BankCustomer("Bojana", "Ristovska", "00903285", "1210", "21.11.1992",
				"bojana_r@gmail.com", 072231747, 15000.00);
		list.add(b4);
		
		//System.out.println(list);
		
		/*for (BankCustomer b:list) {
			System.out.println(b);
		}*/

		return list;
	}

	// creating hashset of BankCustomers
	public static HashSet<BankCustomer> getAllBankCustomersDetails() {
		HashSet<BankCustomer> set = new HashSet<BankCustomer>();
		BankCustomer b1 = new BankCustomer();
		b1.firstName = "Jovan";
		b1.lastName = "Petrov";
		b1.accountNumber = "00896521";
		b1.password = "9876";
		b1.dayOfBirth = "20.05.1995";
		b1.email = "jovan_p@gmail.com";
		b1.phone = 070453707;
		b1.balance = 20000.00;
		set.add(b1);

		BankCustomer b2 = new BankCustomer("Christian", "Filipov", "00987435", "7543", "09.04.1998",
				"christian_f@gmail.com", 071231443, 12000.00);
		set.add(b2);

		BankCustomer b3 = new BankCustomer("Toni", "Ilievski", "00452195", "4519", "02.08.1997", "toni_i@gmail.com",
				072231747, 15000.00);
		set.add(b3);

		BankCustomer b4 = new BankCustomer("Bojana", "Ristovska", "00903285", "1210", "21.11.1992",
				"bojana_r@gmail.com", 072231747, 15000.00);
		set.add(b4);

		//System.out.println(set);
		
		return set;
	}

	public static HashMap<String, String> getAllBankCustomerCredentials() {
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<BankCustomer> set = new HashSet<BankCustomer>();
		BankCustomer b1 = new BankCustomer();
		b1.firstName = "Jovan";
		b1.lastName = "Petrov";
		b1.accountNumber = "00896521";
		b1.password = "9876";
		b1.dayOfBirth = "20.05.1995";
		b1.email = "jovan_p@gmail.com";
		b1.phone = 070453707;
		b1.balance = 20000.00;
		map.put(b1.getAccountNumber(), b1.getPassword());


		BankCustomer b2 = new BankCustomer("Christian", "Filipov", "00987435", "7543", "09.04.1998",
				"christian_f@gmail.com", 071231443, 12000.00);
		map.put(b2.getAccountNumber(), b2.getPassword());

		BankCustomer b3 = new BankCustomer("Toni", "Ilievski", "00452195", "4519", "02.08.1997", "toni_i@gmail.com",
				072231747, 15000.00);
		map.put(b3.getAccountNumber(), b3.getPassword());


		BankCustomer b4 = new BankCustomer("Bojana", "Ristovska", "00903285", "1210", "21.11.1992",
				"bojana_r@gmail.com", 072231747, 15000.00);
		map.put(b4.getAccountNumber(), b4.getPassword());

		return map;
	}
	
	// creating list of Bank details
		public static List<Bank> getAllBankDetails() {
			List<Bank> list1 = new ArrayList<Bank>();
			
			// we take the list from BankCustomers from above and on it we add the Bank the name of the name of the bank and type of account
			// or we use all parameters from bank class
		
			BankCustomer bankcustomer = getAllBankCustomers().get(0); 
					
			Bank c1 = new Bank("Deutsche Bank", "Current Account", bankcustomer);
			list1.add(c1);
			
			bankcustomer = getAllBankCustomers().get(1);
			
			Bank c2 = new Bank("Deutsche Bank", "Saving Account", bankcustomer);
			list1.add(c2);
			
			bankcustomer = getAllBankCustomers().get(2);
			Bank c3 = new Bank("Barclays", "Current Account", bankcustomer);
			list1.add(c3);
			
			//Bank c4 = new Bank("Barclays", "Saving Account", bankcustomer);
			//list1.add(c4);
			
			bankcustomer = getAllBankCustomers().get(3);
			
			Bank c5 = new Bank("NLB Tutunska Banka", "Current Account", bankcustomer);
			list1.add(c5);
			
			//Bank c6 = new Bank("NLB Tutunska Banka", "Saving Account", bankcustomer);
			//list1.add(c6);
			
			//System.out.println(list1);
			
			return list1;
		}

		/*public static void main(String[] args) {
			
			getAllBankCustomers();
		}*/

}
