import java.math.*;

public class NumberAccuracy
{
	//constructor
	NumberAccuracy(){}	
		
	BigDecimal operation(String input1, String input2, int scale)
	{
		//first number
		BigDecimal num1 = new BigDecimal(input1);
		//second number
		BigDecimal num2 = new BigDecimal(input2); 
		//return first number divide second number
		return num1.divide(num2, scale, BigDecimal.ROUND_HALF_UP);
	}
	
	BigDecimal operation(String input1, String input2, String operator)
	{
		//first number
		BigDecimal num1 = new BigDecimal(input1);
		//second number
		BigDecimal num2 = new BigDecimal(input2); 
		switch (operator)
		{
			case "+" : 
				return num1.add(num2);
			case "-" : 
				return num1.subtract(num2);
			case "*" : 
				return num1.multiply(num2);
			default :
				return null;
		}
	}
}
