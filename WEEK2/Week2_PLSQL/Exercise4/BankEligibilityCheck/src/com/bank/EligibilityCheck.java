package com.bank;

import java.time.LocalDate;
import java.time.Period;

public class EligibilityCheck {
	
	    public static int calculateAge(LocalDate dateOfBirth) {
	        LocalDate today = LocalDate.now();
	        return Period.between(dateOfBirth, today).getYears();
	    
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
