/*
 * Tracing Recursion Worksheet #1, exercise #3
 * HL CS
 * TRW1E3c counter-example, don't do it this way
 */


public class TRW1E3c
{
	static int a = 3;
	static int d = 6;
	
	//public static int mystery(int n, int a, int d)
	public static int mystery(int n)
	{
		System.out.println(">>>> n = " + n +
			"    a = " + a + "   d = " + d);
		if(n == 1)
			return a;
		else
			//return d + mystery(n-1, a, d);
			return d + mystery(n-1);
		
	}
	
	public static void main (String[] args)
	{
		//System.out.println( mystery(3,2,6) );
		System.out.println( mystery(3) );
		
		//System.out.println( mystery(6,5,4) );
		a =5; d=4;
		System.out.println( mystery(6) );
	}
}
/*
OUTPUT

>>>> n = 3    a = 2   d = 6
>>>> n = 2    a = 2   d = 6
>>>> n = 1    a = 2   d = 6
14

*/
