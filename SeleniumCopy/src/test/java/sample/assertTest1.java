package sample;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class assertTest1 {
	// assertEquals
	@Test
	public void testcase1() {
		int a = 1;
		int b = 3;
		int x = 2;
		assertEquals(
				"assert if value: " + a + " is equal to " + b + " with a difference of positive x value:" + x,
				a, b, x);
	}

	// assertFalse
	@Test
	public void testcase2() {
		int a = 5;
		boolean flag;
		if (a < 2) {
			flag = true;
		} else {
			flag = false;
		}
		assertFalse(flag);
	}

	// assertNotNull
	@Test (timeout=20)
	public void testcase3() {
		String newStr = "newStr";
		assertNotNull("The object newStr is null", newStr);
	}
	@Test
	public void testCase4()
	{ 
		String obj = "java Junit";
		String x1 = obj;
		String otherObject = "selenium";

		//Test will pass
		Assertions.assertNotSame(obj, otherObject);

		//Test will fail
		Assertions.assertNotSame(obj, x1);

		//Test will pass
		Assertions.assertSame(obj, x1);

		// Test will fail
		Assertions.assertSame(obj, otherObject);
	}
	
	/*@Test
    public void verifyEqualCharValues () {
        char [] actualChar= {'H','O','M','E'};
        char [] expectedChar="HOME". toCharArray ();
        assertArrayEquals (expectedChar, actualChar);
    }  */ 
 }

