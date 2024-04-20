package DS.Lab.Lab1.L1Q3;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
		this(0, 0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	//Accesor
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	//Mutator
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//Return monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	//Return monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//Withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}

	//Deposit
	public void deposit(double amount) {
		balance += amount;
	}
}
