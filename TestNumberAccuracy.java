import java.util.Scanner;
import java.math.*;

public class TestNumberAccuracy
{
	public static void main(String args[])
	{
		NumberAccuracy accuracy = new NumberAccuracy();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the dividend : ");
		double num1 = input.nextDouble();
		System.out.print("Enter the divisor : ");
		double num2 = input.nextDouble();
		System.out.print("Enter the accuracy you want : ");
		int scale = input.nextInt();
		BigDecimal ans = accuracy.operation(num1, num2, scale);
		System.out.println("The answer is " + ans);
	}
}
