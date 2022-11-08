/*
 *	System.out.println.java
 *	Example that shows (the WithoutMethods.java) code after
 *	refactoring. ( http://bit.ly/qZPw9c & http://bit.ly/nA3Ktz )
 *	Here we take the main method and break it apart
 *	into smaller, clearer, cleaner and more manageable
 *	pieces of code that can easily be re-used.	IB CompSci1 MDV
 */

public class WithMethods
{

	// Default terminal width constant; change as needed.
	public static final int SCREEN_WIDTH = 80;

	//	What tasks/functions/routines are repetitive
	//	or need to be re-used?
	//			  v-System.out.println data type, result returned by the method/fn
	public static String repeatText(String text, int times)
	{	String repeated = "";		// ^- arguments of the method/fn (input)
		for(int i = 0; i < times; i++)
			repeated = repeated + text;
		return repeated;
	}
	
	public static String centerText(String text)
	{	String spaces = "";
		for(int i = 0; i < ( SCREEN_WIDTH - text.length() )/2; i++)
			spaces = spaces + " ";
		return spaces + text;
	}

	public static void main (String[] args)
	{
		String cool = IBIO.input("Enter text: ");
		String marquee = repeatText("*", cool.length() + 2);

		// Now we print the top of the marquee
		System.out.println( centerText(marquee) );
			
		// Print the name and add the sides of the marquee
		System.out.println( centerText("*" + cool + "*") );
			
		// Now we print the bottom of the marquee
		System.out.println( centerText(marquee) );
	}
}

/*
Enter text: COOL TEXT HERE
                                ****************
                                *COOL TEXT HERE*
                                ****************
*/
