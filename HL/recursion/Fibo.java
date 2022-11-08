
public class Fibo
{
	private static int c;
	
	public static int fibonacci(int n)
	{	c++;
		if(n==0)
		{	return 0;
		} else if(n==1)
		{	return 1;
		} else
		{	return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main (String[] args)
	{
		c = 0;
		System.out.println( fibonacci(20) );
		System.out.println( c );
	
	}
}

