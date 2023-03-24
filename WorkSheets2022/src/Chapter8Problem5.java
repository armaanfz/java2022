public class Chapter8Problem5
{
	public static int gcd(int n, int m)
	{
		int gcd = 0;
		if ( n == m )
		{	gcd = n;
		}
		else {
			while (n != m)
			{
				if ( n < m )
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

	public static boolean good(int a, int b, int c)
	{	
		return (a*a + b*b == c*c);
	}
	
	public static void main (String args[])
	{
		int counter = 0;
		int sum		= 0;
		for (int i = 1; i < 100; i++)
			for (int j = i; j < 100; j++)
				for (int k = j; k < 100; k++)
					// GCD of 3 number = 1 kills factors
					if ( good(i, j, k) && gcd(gcd(i, j), k)==1 )
					{	System.out.printf("%4d %4d %4d\n", i, j, k);
						counter ++;
					}
					
		System.out.println("\nNumber of solutions found: " + counter);
	}
}

