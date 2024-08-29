package com.bank;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;


public class EligibilityCheckTest {
	@Test
	    public void testCalculateAge() {
	        LocalDate dateOfBirth = LocalDate.of(1990, 8, 29);
	        int age = EligibilityCheck.calculateAge(dateOfBirth);
	        assertEquals(34, age);  // Assuming today's date is 2024-08-29
	    }
	}



//import java.time.*;