/*
 * This is problem 6.3, modified to
 * try to print a diamond/
 * the 1967-1972 Renault logo :)
 * 
 */

public class Chapter6Problem3
{
	
	// this method makes a String of <howMany> asterisks ( a line of <howMany> *s )
	static String stars(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + "*";
		}
		return output;
	}
	
	// method that generates <hoMany> spaces
	static String spaces(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + " ";
		}
		return output;
	}	
	
	public static void main (String[] args)
	{
		int n = 5;
		
		for(int i = 0; i <= n; i++)
		{	// lines 39 is 6.3
			System.out.println( spaces(n-i) + stars(n)
			+ spaces(i*2) + stars(n) );
			// line 40 completes the top of the diamond
		}
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println( spaces(i) +
			stars(n) );
		}

	}

}

