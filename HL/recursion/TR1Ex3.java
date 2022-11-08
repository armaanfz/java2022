// Tracing recursion exercises, set #1
// Exercise #3

public class TR1Ex3
{
	// = d*(n-1)+a
	static int rec(int n, int a, int d)
	{
		if(n==1)
			return a;
		else
			return d + rec(n-1,a,d);
	}

	public static void main (String [] args)
	{
		int n =3, a=2, d=6;
		System.out.println( rec(n,a,d) );
		System.out.println( (d*(n-1)+a) );
		
		n=5; a=6; d=7;
		System.out.println( rec(n,a,d) );
		System.out.println( (d*(n-1)+a) );
		
		n=9; a=7; d=5;
		System.out.println( rec(n,a,d) );
		System.out.println( (d*(n-1)+a) );
	}
}
