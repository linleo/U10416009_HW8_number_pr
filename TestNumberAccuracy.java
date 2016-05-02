import java.util.Scanner;

public class TestNumberAccuracy
{
	public static void main(String args[])
	{
		NumberAccuracy accuracy = new NumberAccuracy();
		
		Scanner input = new Scanner(System.in);
		//user input the first number
		System.out.print("Enter the first number : ");
		String num1 = input.next();
		//user input the second number
		System.out.print("Enter the second number : ");
		String num2 = input.next();
		System.out.print("Enter the operator to do operation (ex:+,-,*,/) : ");
		//user input operator
		String operator = input.next();
		if (operator.equals("/"))
		{
			//user input the accuracy
			System.out.print("Enter the accuracy you want : ");
			int scale = input.nextInt();
			//display result
			System.out.println("The answer is " + accuracy.operation(num1, num2, scale));
		}
		else 
		{
			System.out.println("The answer is " + accuracy.operation(num1, num2, operator));
		}
		
		//ask user again or not
		System.out.print("Again?(Y/N)\n");
		String again = input.next();
		while (again.equals("Y") || again.equals("y") || again.equals("Yes") || again.equals("yes"))
		{
			//user input the second number
			System.out.print("Enter the first number : ");
			num1 = input.next();
			//user input the second number
			System.out.print("Enter the second number : ");
			num2 = input.next();
			System.out.print("Enter the operator to do operation (ex:+,-,*,/) : ");
			//user input operator
			operator = input.next();
			if (operator.equals("/"))
			{
				//user input the accuracy
				System.out.print("Enter the accuracy you want : ");
				int scale = input.nextInt();
				//display result
				System.out.println("The answer is " + accuracy.operation(num1, num2, scale));
			}
			else 
			{
				System.out.println("The answer is " + accuracy.operation(num1, num2, operator));
			}			
			System.out.print("Again?(Y/N)\n");
			again = input.next();
		}
	}
}
