import java.util.Scanner;

public class Chapter5Problem1
{
	public static double sum(int n)
	{
		double sum = 0;
		double denom = 5.0;
		double term = 0;
		for(int i = 1; i <= n; i++)
		{	term = 1/denom;
			sum = sum + term;
			denom = denom * 5;
		}
		return sum;
	}
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Up to which term to add? ");
		int n = input.nextInt();
		
		System.out.println( sum(n) );
		
	}
}

