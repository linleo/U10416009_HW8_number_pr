import java.util.Scanner;
import java.math.*;

public class TestNumberAccuracy
{
	public static void main(String args[])
	{
		NumberAccuracy accuracy = new NumberAccuracy();
		
		Scanner input = new Scanner(System.in);
		//user input the dividend
		System.out.print("Enter the dividend : ");
		String num1 = input.next();
		//user input the divisor
		System.out.print("Enter the divisor : ");
		String num2 = input.next();
		//user input the accuracy
		System.out.print("Enter the accuracy you want : ");
		int scale = input.nextInt();
		BigDecimal ans = accuracy.operation(num1, num2, scale);
		//display result
		System.out.println("The answer is " + ans);
		//ask user again or not
		System.out.print("Again?(Y/N)\n");
		String again = input.next();
		while (again.equals("Y") || again.equals("y") || again.equals("Yes") || again.equals("yes"))
		{
			//user input the dividend
			System.out.print("Enter the dividend : ");
			num1 = input.next();
			//user input the divisor
			System.out.print("Enter the divisor : ");
			num2 = input.next();
			//user input the accuracy
			System.out.print("Enter the accuracy you want : ");
			scale = input.nextInt();
			ans = accuracy.operation(num1, num2, scale);
			System.out.println("The answer is " + ans);
			System.out.print("Again?(Y/N)\n");
			again = input.next();
		}
	}
}
