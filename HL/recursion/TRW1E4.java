/*
 * Tracing Recursion Worksheet #1, exercise #3
 * HL CS
 * TRW14
 */


public class TRW1E4
{
	public static int f(int k, int n)
	{
		System.out.println(">>>> k = " + k +
			"    n = " + n);
		if(n == k)
			return k;
		else
			if(n > k)
				return f(k, n-k);
			else
				return f(k-n, n);
	}
	
	public static void main (String[] args)
	{
		System.out.println( f(6, 8) );
		
		System.out.println( f(9, 21) );
		
	}
}
