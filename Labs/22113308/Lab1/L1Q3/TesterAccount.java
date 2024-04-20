package DS.Lab.Lab1.L1Q3;

public class TesterAccount {
	public static void main(String[] args) {
		Account acc = new Account(1122, 20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
		System.out.println("Date Created: " + acc.getDateCreated());
	}
}
