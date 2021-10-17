package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
 StringCalculator calculator=new  StringCalculator();
    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    public void addTwoNumberIsSumOfNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }
  //  "add test cases to check multiple test cases"
    @Test
    public void addUnknownAmountOfNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(13, calculator.add("1,2,5,3,2"));

    }
    @Test
	public void acceptNewlineAsValidDelimiter() throws Exception
	{
    	
		assertEquals(6, calculator.add("1\n2,3"));
	}
 
    @Test
	public void customDelimeter() throws Exception
	{
		assertEquals(3, calculator.add("//;\n1;2"));
	}
 //
//    @Test
//	public void NegativeNumbers()
//	{
//		try {
//			calculator.add("-1,-2,3");
//			
//		}
//		
//		catch(RuntimeException e)
//		{
//			assertEquals("Negatives not allowed: [-1, -2]", e.getMessage());
//		}
//	}
    @Test
    public void NegativeNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("//;\n1;-2;5");
        }catch (StringCalculatorException e) {
            assertEquals("negatives not allowed -2", e.getMessage());
        }
    }

}
