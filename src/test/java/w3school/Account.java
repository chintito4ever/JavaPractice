package w3school;

public class Account {
	private String number;
	private double accountBalance;
	private String customerName;
	private String customerEMailAddress;
	private String customerPhoneNumber;
	
	
	public void deposit(double depositAmount) {
		this.accountBalance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if (this.accountBalance - withdrawalAmount <0) {
			System.out.println("Only " + accountBalance + " available. Withdrawal not processed");
		}
		else {
			accountBalance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + accountBalance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEMailAddress() {
		return customerEMailAddress;
	}
	public void setCustomerEMailAddress(String customerEMailAddress) {
		this.customerEMailAddress = customerEMailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
