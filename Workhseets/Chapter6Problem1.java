
public class Chapter6Problem1
{
	// methods: divide and conquer!
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
	
	public static void main (String[] args)
	{
		String s;
		System.out.println( "Remember: A declared but uninitialised String is NULL" );
		int n = IBIO.inputInt("Square size: ");
		System.out.println("The easy way");
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println( stars(i+1) );
		}
		
		System.out.println();
		System.out.println("Headachey way");
		System.out.println();
		
		for(int lines = 1; lines <= n; lines++)
		{
			for(int asterisks = 1; asterisks <= lines; asterisks++)
			{	System.out.print( "*" );
			}
			System.out.println();
		}
		
	}
	
}

