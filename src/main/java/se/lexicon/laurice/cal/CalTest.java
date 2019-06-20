package se.lexicon.laurice.cal;


import org.junit.Assert;
import org.junit.Test;


public class CalTest {



		double num1,num2;
		double expected ;
		double actual;

		@Test
		public void shouldReturnCorrectAdditionAnswer() {
			num1=1.0;
			num2=3.0;
			expected=4.0;
			actual =calculator.add(num1, num2);
			Assert.assertEquals(expected, actual, 0);
		
		}
		@Test
		public void shouldReturnCorrectSubstractionAnswer() {
			num1=3.0;
			num2=1.0;
			expected=2.0;
			actual =calculator.sub(num1, num2);
			Assert.assertEquals(expected, actual, 0);
		
		}
		
		@Test
		public void shouldReturnCorrectMultiplicationAnswer() {
			num1=3.0;
			num2=1.0;
			expected=3.0;
			actual =calculator.mult(num1, num2);
			Assert.assertEquals(expected, actual, 0);
			
		}
		@Test
		public void shouldReturnCorrectDivisionAnswer() {
			num1=3.0;
			num2=1.0;
			expected=3.0;
			actual =calculator.div(num1, num2);
			Assert.assertEquals(expected, actual, 0);
			
		}
		
		@Test
		public void testDivideByZeroReturnZero() {
			boolean isThrown = false;
			try {
				calculator.div(0, 1);
			} catch(Exception e) {
				System.out.println(e.getMessage());
				isThrown = true;
			}
			Assert.assertTrue(isThrown);
		}
		
	}


