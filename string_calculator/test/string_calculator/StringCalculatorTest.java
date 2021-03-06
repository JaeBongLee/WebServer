package string_calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator stringCal;
	
	@Before
	public void setup(){
		stringCal = new StringCalculator();
	}
	
	@Test
	public void add_emptyString() {
		int result = stringCal.addNumberInString("");
		assertEquals(0,result);
	}

	@Test
	public void add_oneNumString() {
		int result = stringCal.addNumberInString("1");
		assertEquals(1,result);
	}

	
	@Test
	public void add_twoNumberSumStringByComma() {
		int result = stringCal.addNumberInString("1,2");
		assertEquals(3,result);
	}
	
	@Test
	public void add_multiNumberSumStringByComma() {
		int result = stringCal.addNumberInString("1,2,3");
		assertEquals(6,result);
	}
	
	@Test
	public void add_multiNumberSumStringByCommaAndSemi() {
		int result = stringCal.addNumberInString("1,2;3");
		assertEquals(6,result);
	}
	
	@Test
	public void add_multiNumberSumStringByCustom() {
		int result = stringCal.divideCustom("//:\n1:2:3");
		assertEquals(6,result);
	}
	
	@Test(expected=RuntimeException.class)
	public void add_minusNumberResult() throws Exception {
		stringCal.divideCustom("-1,2,3");
	}
	
	

}
