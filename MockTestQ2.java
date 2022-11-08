/*
	NOTE that this program will not compile until
	write your answers completing the fruitful (non void) methods.
	you may want to include dummy return false; or return -1; to make this class compile.

	This class does not require IBIO.java unless you use it;
	IBIO.output()	= System.out.println()
	IBIO.out()		= System.out.print()
	No direct user (keyboard) input is required here, either.
	
	Good luck.
*/

public class MockTestQ2
{
	public static boolean isEven(int n)
	{
		// your code goes here
	}
	
	public static boolean isPositive(int n)
	{
		// your code goes here
	}
	
	public static int abs(int n)
	{
		// your code goes here
	}
	
	public static boolean isFactor(int n, int x)
	{
		// your code goes here
	}
	
	public static void listFactors(int n)
	{
		// your code goes here
	}
	
	public static int countFactors(int n)
	{
		// your code goes here
	}
	
	public static boolean isPrime(int n)
	{
		// your code goes here
	}
	
	public static void listPrimeFactors(int n)
	{
		// your code goes here
	}
	
	// GCD by subtraction method
	public static int gcd(int n, int m)
	{
		int gcd = 0;
		if ( n == m )
		{	gcd = n;
		} else {
			while (n != m)
			{
				if ( m > n )
				{	m = m - n;
					gcd = m;
				}
				else
				{	n = n - m;
					gcd = n;
				}
			}
		}
		return gcd;
	}
	
	public static int lcm(int a, int b)
	{
		// your code goes here
	}
	
	public static void main (String[] args)
	{
		// your code for instruction/step #1 goes here
		
		// NO MODIFICATIONS REQUIRED BELOW THIS COMMENT ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
		System.out.println("Method call\t\tYour result\tExpected result");
		System.out.println("=======================================================");
		System.out.println( "isEven(24681012)\t" + isEven(24681012) + "\t\ttrue" );
		System.out.println( "isEven(12345679)\t" + isEven(12345679) + "\t\tfalse" );
		System.out.println( "isPositive(123456789)\t"  + isPositive(123456789)  + "\t\ttrue" );
		System.out.println( "isPositive(-987654321)\t" + isPositive(-987654321) + "\t\tfalse" );
		System.out.println( "abs(123456789)\t\t"  + abs(123456789) + "\t123456789" );
		System.out.println( "abs(-987654321)\t\t" + abs(-987654321) + "\t987654321" );
		System.out.println( "isFactor(120, 24)\t" + isFactor(120, 24) + "\t\ttrue" );
		System.out.println( "isFactor(120, 44)\t" + isFactor(120, 44) + "\t\tfalse" );
		System.out.print("listFactors(120)\t");
		listFactors(120); System.out.println("\nExpected result:\t1 2 3 4 5 6 8 10 12 15 20 24 30 40 60 120");
		System.out.println( "countFactors(120)\t" + countFactors(120) + "\t\t16" );
		System.out.println( "isPrime(947)\t\t"  + isPrime(947)  + "\t\ttrue" );
		System.out.println( "isPrime(1869)\t\t" + isPrime(1869) + "\t\tfalse" );
		System.out.print("listPrimeFactors(120)\t");
		listPrimeFactors(120); System.out.println("\t1 2 3 5");
		System.out.println( "lcm(12, 21)\t\t" + lcm(12, 21) + "\t\t84" );
	}
}
