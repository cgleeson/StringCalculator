package teststringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import stringcalculator.StringCalculator;

public class TestStringCalculator {
	
	StringCalculator cal = new StringCalculator();

	@Test
	public void add() {
		
		assertEquals (cal.add(10, 20), 30) ;
	}
	
	@Test
	public void subtract() {
		
		assertEquals (cal.subtract(20, 10), 10) ;
	}
	

}
