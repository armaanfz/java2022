/*
 * Tracing Recursion Worksheet #1, exercise #3
 * HL CS
 * TRW1E3 - proper way
 */


public class TRW1E3
{
	public static int mystery(int n, int a, int d)
	{
		System.out.println(">>>> n = " + n +
			"    a = " + a + "   d = " + d);
		if(n == 1)
			return a;
		else
			return d + mystery(n-1, a, d);
		
	}
	
	public static void main (String[] args)
	{
		System.out.println( mystery(3,2,6) );
		
		System.out.println( mystery(6,5,4) );
		
	}
}
/*
OUTPUT

>>>> n = 3    a = 2   d = 6
>>>> n = 2    a = 2   d = 6
>>>> n = 1    a = 2   d = 6
14

*/
