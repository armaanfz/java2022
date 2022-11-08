/*
 *	WithMethods2.java
 *	Example that shows (the WithMethods.java) code after further
 *	refactoring. ( http://bit.ly/qZPw9c & http://bit.ly/nA3Ktz )
 *	Here we build a method that puts a name inside a marquee
 *	NOT necessarily better than WithMethods.java, unless you
 *	need a spcific "marquee" making method.	IB CompSci1 MDV
 *				[ Note how easy it is to loop the main method now ]
 */

public class WithMethods2
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

	public static String drawMarquee(String text)
	{
		String marquee = "";
		String line = repeatText("*", text.length() + 2);
		marquee = marquee + centerText(line) + "\n";	// top
		marquee += centerText("*" + text + "*") + "\n";	// middle
		marquee = marquee + centerText(line) + "\n";	// bottom
		return marquee;
	}

	public static void main (String[] args)
	{
		char again;
		String cool;
		do {
			cool = IBIO.input("Enter text: ");
			System.out.println( drawMarquee(cool) );
			System.out.println("");						// leave an empty line
			again = IBIO.inputChar("Again (y/n)? ");
		} while(again != 'n');
	}
}

/*
Enter text: Pac-man
                                   *********
                                   *Pac-man*
                                   *********


Again (y/n)? y
Enter text: Lara Croft
                                  ************
                                  *Lara Croft*
                                  ************


Again (y/n)? n

*/
