package lab7;

public class bank {

	public static void main(String[] args) {
		Account a1 = new Account(1122 , 20000);
		Account.setAnnualInteresRate(4.5);
		a1.Withdraw(2500);
		a1.diposit(3000);
		System.out.println("The balance is : "+ a1.getBalance());
		System.out.println("The mounthly interest is : "+ a1.getMonthlyInterest());
		System.out.println("The Date when the account was created:"+ a1.getDateCreated());

	}

}
