
package lab7;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private static double annualInteresRate=0;
	private Date dateCreated=new Date();
	
	 Account() {
		
	}
	
	 Account(int newId,double newBalance){
		 id=newId;
		 balance=newBalance;
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInteresRate() {
		return annualInteresRate;
	}

	public static void setAnnualInteresRate(double annualInteresRate) {
		annualInteresRate = annualInteresRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	 
	public  double getMonthlyInterestRate() {
		
		return annualInteresRate/12;
	}
	
	public  double getMonthlyInterest() {
		
		return getMonthlyInterestRate()*balance;
	}
	
	public void Withdraw(double money) {
		balance-=money;
	}
	public void diposit(double money) {
		balance+=money;
	}

	
}
