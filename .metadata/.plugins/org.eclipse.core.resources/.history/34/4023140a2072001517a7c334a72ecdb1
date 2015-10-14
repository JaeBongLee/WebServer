package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {

	Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = cal.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void textDivide() throws Exception {
		int result = cal.divide(12, 4);
		assertEquals(3, result);
	}

	@Test
	public void testMulti() throws Exception {
		int result = cal.multi(12, 4);
		assertEquals(48, result);
	}
	
	@After
	public void teardown(){

	}
}
