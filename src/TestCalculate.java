import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static  org.testng.Assert.assertEquals;
@Test
public class TestCalculate {
	private Calculator calculator;
	
			@BeforeTest
			public void init()
			{
				calculator= new Calculator();
			}
	
	//1)Test for zero empty string return zero
			public void emptyStringReturnZero() throws Exception 
			{
				assertEquals(calculator.calculate(""),0);
			}

	//2)Test for single number return the value of number
			public void sigleNumberRepilesValue() throws Exception 
			{
				assertEquals(calculator.calculate("1"),1);
			}
			
	//3)Test for two numbers delimited comma return sum
			public void twoNumbersCommaReturnsSum() throws Exception
			{
				assertEquals(calculator.calculate("1,2"),3);
			}
	//4) Two numbers new line delimiter returns the sum
			public void twoNumbersNewlineReturnsSum() throws Exception
			{
				assertEquals(calculator.calculate("1\n2"),3);
				
			}
	//5)Three number both way delimiter returns sum
			public void ThreeNumberBothwayReturnsSum() throws Exception
			{
				assertEquals(calculator.calculate("1,2,3"),6);
				assertEquals(calculator.calculate("1\n2,3"),6);
				
			}
	//6) Negative values throws exception
			@Test(expectedExceptions=Exception.class)
			public void negativeInputReturnsException() throws Exception
			{
				calculator.calculate("-1,2");
				calculator.calculate("-1");
				
				
			}
	//7)Numbers Greater than 1000 are ignored	
			public void numbersGreateThan1000() throws Exception 
			{
				assertEquals(calculator.calculate("10,10,10000"),20);
			}
	
}
