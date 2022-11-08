/*
 * Fibonacci calculator with method
 * class example
 * mrdv
 */
 
public class MethodFibonacci
{
	public static long fibonacci(int term)
	{
		if(term < 2)
		{	return term;
		}
		long term1 = 0;
		long term2 = 1;
		long next = 0;
		for( int i = 2; i <= term; i++)
		{	next = term1 + term2;
			term1 = term2;
			term2 = next;
		}
		return next;
	}
	
	public static int numberOfDigits(long n)
	{
		int digits = 0;
		do
		{	digits++;
			n = n / 10;
		} while(n > 0);
		return digits;
	}
	
    public static void main (String[] args)
    {
		int n;
		System.out.println("Fibonacci sequence calculator");
		do
		{
			do // limit validation
			{	n = IBIO.inputInt("Calculate up to term (n)? ");
				if(n < 0)
				{	System.out.println("ERROR - Enter a positive number: ");
				}
			} while( n < 0 );
			
			if( n == 0 )
			{	break;
			}
			
			long result = fibonacci(n);
			// how many digits
			System.out.print(result + " has ");
			int digits = numberOfDigits(result);
			System.out.println(digits + " digits\n");
		} while(n != 0);
	} // end main method
} // end of class/program
