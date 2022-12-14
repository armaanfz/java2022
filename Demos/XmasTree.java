/*
 * This tries to draw an ugly Xmas Tree
 * Hohohoho
 */

public class XmasTree
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
		int n = IBIO.inputInt("Xmas tree size? ");
		System.out.println("\n\n\n");
		for(int i = 1; i <= n; i++)
		{
			System.out.println( spaces(n-i) + stars(i) + stars(i-1) );

		}
		// now we draw the trunk
		int centre = (n + (n-1))/2;
		for(int i = 1; i <= n/2; i++)
		{
			System.out.println( spaces(centre) +
			stars(1) );
		}
		System.out.println("\n\nMERRY CHRISTMAS");

	}

}

