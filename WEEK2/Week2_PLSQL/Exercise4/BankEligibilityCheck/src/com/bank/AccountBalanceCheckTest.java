package com.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountBalanceCheckTest {

	@Test
	public void testHasSufficientBalance() {
        double accountBalance = 500.0;
        double amount = 300.0;
        
        boolean result = AccountBalanceCheck.hasSufficientBalance(accountBalance, amount);
        assertTrue(result);  // The balance is sufficient, so it should return true
        
        amount = 600.0;
        result = AccountBalanceCheck.hasSufficientBalance(accountBalance, amount);
        assertFalse(result);  // The balance is insufficient, so it should return false
    }
}


