package com.bank;

import org.junit.Test;
import static org.junit.Assert.*;


public class LoanCalculatorTest {

	@Test
	 public void testCalculateMonthlyInstallment() {
        double loanAmount = 10000.0;
        double annualInterestRate = 5.0;
        int loanDurationYears = 2;
        
        double monthlyInstallment = LoanCalculator.calculateMonthlyInstallment(loanAmount, annualInterestRate, loanDurationYears);
        assertEquals(438.71, monthlyInstallment, 0.01); // Allowing a tolerance of 0.01 for floating-point arithmetic
    }

}
