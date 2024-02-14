import java.io.*;

public class GFG1 {

	public static void displayBalance(int balance)
	 {
		System.out.println("Current Balance : " + balance);
		System.out.println();
	}

	public static int amountWithdrawing(int balance, int withdrawAmount) {
		System.out.println("Withdrawal Operation:");
		System.out.println("Withdrawing Amount : " + withdrawAmount);
		if (balance >= withdrawAmount)
		 {
			balance = balance - withdrawAmount;
			System.out.println("Please collect your money and card");
		} else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return balance;
	}

	public static int amountDepositing(int balance, int depositAmount) {
		System.out.println("Deposit Operation:");
		System.out.println("Depositing Amount : " + depositAmount);
		balance = balance + depositAmount;
		System.out.println("Your Money has been successfully deposited");
		displayBalance(balance);
		return balance;
	}

	public static void main(String[] args) {
		int balance = 50000;
		int withdrawAmount = 8000;
		int depositAmount = 2000;

		displayBalance(balance);
		balance = amountWithdrawing(balance, withdrawAmount);
		balance = amountDepositing(balance, depositAmount);
	}

    
}
