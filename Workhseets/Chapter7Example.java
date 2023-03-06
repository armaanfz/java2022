/*
 * Chapter 7 example
 * 
 */

public class Chapter7Example
{
	public static String pad(int n, int tab)
	{	// make a string of the number
		String st = "" + n;
		// st . length()=how many characters are in st
		while (st.length() < tab)
			st = " " + st; // add spaces in front of the number
		return st;

	}

    public static void main(String[] args)
    {
		for (int i = 1; i <= 20; i++)
		{
			String s = pad(i * i, 3) +
				pad(i * i, 4) + pad(i * i * i, 5);
			IBIO.output(s);
		}
	}
	
}
