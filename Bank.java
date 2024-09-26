package Homework_ATM_FinalProject;

public class Bank {
	
	private static String bankName;
	private static String acctype;
	private static BankCustomer bankcustomer;
	
	
	public Bank() {
	}


	public Bank(String bankName, String acctype, BankCustomer bankcustomer) {
		super();
		this.bankName = bankName;
		this.acctype = acctype;
		this.bankcustomer = bankcustomer;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getAcctype() {
		return acctype;
	}


	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}


	public BankCustomer getBankcustomer() {
		return bankcustomer;
	}


	public void setBankcustomer(BankCustomer bankcustomer) {
		this.bankcustomer = bankcustomer;
	}


	//@Override
	public String toString() {
		return  bankName + ", " + acctype + ", "  + bankcustomer;
	}

	
	
	/*public static void showDetails() {
    System.out.println("\nBank Customer Details " + bankcustomer + "\nBank Name " + bankName + "\nAccount Type " + acctype);
	}*/
	
	
	/*if (id.equals("003457001") && pw.equals("1290")) {
		String name = "Elena Georgievska";
		String acctype = "Savings Account";
		bal = 115000;
		System.out.println("\nName: " + name + "\nAccount Type: " + acctype + "\nBalance: " + bal);*/

}
