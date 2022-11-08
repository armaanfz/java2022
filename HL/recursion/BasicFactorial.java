import java.util.Scanner;

public class BasicFactorial
{
	public static long factorial(int n)
	{	if(n == 0)
		{	return 1;
		}
		return n * factorial(n - 1);
	}
	
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = input.nextInt();
		while( n < 0 || n > 20) // range check
		{	System.out.print("Error - Re-enter a number between 0 and 20 for n = ");
			n = input.nextInt();
		}
		input.close();
		System.out.print(n + "! = ");
		System.out.println( factorial(n) );
	}
}

