package com.bank;

public class LoanCalculator {
	
	    public static double calculateMonthlyInstallment(double loanAmount, double annualInterestRate, int loanDurationYears) {
	        double monthlyInterestRate = annualInterestRate / 12 / 100;
	        int numberOfPayments = loanDurationYears * 12;
	        if (monthlyInterestRate == 0) {
	            return loanAmount / numberOfPayments;
	        } else {
	            return (loanAmount * monthlyInterestRate) / 
	                   (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
	        }
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
