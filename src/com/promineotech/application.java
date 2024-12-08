package com.promineotech;

import java.text.DecimalFormat;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double savingsAccountBalance = 29.00;
		double depositAmount = 100.00;
		double withdrawalAmount = 50.00;
		double newSavingsAccountBalance = 0.00;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Initial Savings Account Balance: $" + df.format(savingsAccountBalance));
		
		// Add deposit and display new balance
				newSavingsAccountBalance = savingsAccountBalance + depositAmount;
				System.out.println("Savings Account Balance after Deposit: $" + df.format(newSavingsAccountBalance));

				// Subtract withdrawal and display new balance
				newSavingsAccountBalance -= withdrawalAmount;
				System.out.println("Savings Account Balance after Withdrawal: $" + df.format(newSavingsAccountBalance));
		
		}

}

