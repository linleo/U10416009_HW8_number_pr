import java.math.*;

public class NumberAccuracy
{
	NumberAccuracy(){}	
		
	BigDecimal operation(double input1, double input2, int scale)
	{
		BigDecimal num1 = new BigDecimal(input1);
		BigDecimal num2 = new BigDecimal(input2); 
		return num1.divide(num2, scale, BigDecimal.ROUND_HALF_UP);
	}
}
