package pk.cui.sc.labfinal.calculater;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	private static Calculator calculator;
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		calculator = new Calculator();
	}


	@Test
	public void testFindMax(){  
			assertEquals(12,calculator.findMax(10,6,12));  
			assertEquals(-9,calculator.findMax(-12,-11,-9));  
		} 
	@Test  
	public void testSquare1(){  
		assertEquals(9,calculator.square(3));  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}


	}


