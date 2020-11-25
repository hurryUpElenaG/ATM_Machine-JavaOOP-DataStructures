package Homework_ATM_FinalProject;

public class BankCustomer {

	protected String firstName;
	protected String lastName;
	protected String accountNumber;
	protected String password;
	protected String dayOfBirth;
	protected String email;
	protected int phone;
	protected double balance;

	public BankCustomer() {

	}

	public BankCustomer(String firstName, String lastName, String accountNumber, String password,
			String dayOfBirth, String email, int phone, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.password = password;
		this.dayOfBirth = dayOfBirth;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return  firstName + ", " +  lastName + ", " + accountNumber + ", " +  password + ", " 
	            +  dayOfBirth + ", " +  email + ", " +  phone + ", " +  balance;
	}

	

}
