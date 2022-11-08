/*
 *      WithoutMethods.java
 *      Example that shows code containing a degree
 * 		of redundancy that begs for methods to be
 * 		implemented.				IB CompSci1 MDV
 */

public class WithoutMethods
{

	// Default terminal width constant; change as needed.
	public static final int SCREEN_WIDTH = 80;

	public static void main (String[] args)
	{
		String cool = IBIO.input("Enter text: ");
		int length = cool.length();

		// Now we add spaces to center the top of the marquee
		for(int i = 0; i < (SCREEN_WIDTH - length)/2; i++)
			System.out.print(" ");

		// Now we print the top of the marquee
		for(int i = 0; i < length + 2; i++)
			System.out.print("*");

		// Now we go down one line
		System.out.println("");

		// Now we add spaces to center the name
		for(int i = 0; i < (SCREEN_WIDTH - length)/2; i++)
			System.out.print(" ");
			
		// Print the name and add the sides of the marquee
		System.out.println("*" + cool + "*");

		// Now we add spaces to center the bottom of the marquee
		for(int i = 0; i < (SCREEN_WIDTH - length)/2; i++)
			System.out.print(" ");
			
		// Now we print the bottom of the marquee
		for(int i = 0; i < length + 2; i++)
			System.out.print("*");
	}
}

/*
Enter text: Lara Croft
                                   ************
                                   *Lara Croft*
                                   ************
*/
