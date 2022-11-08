

public class CharDemo
{
	
	public static void main (String[] args)
	{
		char c1 = IBIO.inputChar("Enter a character: ");
		char c2 = IBIO.inputChar("Enter another character: ");
		//char c3 = IBIO.inputChar("Enter another another character: ");
		System.out.println( c1 + " > " + c2 + " = " + (c1 > c2) );
		System.out.println( c1 + " < " + c2 + " = " + (c1 < c2) );
		System.out.println( c1 + " >= " + c2 + " = " + (c1 >= c2) );
		System.out.println( c1 + " <= " + c2 + " = " + (c1 <= c2) );
		System.out.println( c1 + " == " + c2 + " = " + (c1 == c2) );
		
		if(c1 >= 'A' && c1 <= 'Z')
		{	System.out.println( c1 + " is a capital letter");
		} else if(c1 >= 'a' && c1 <= 'z')
		{	System.out.println( c1 + " is a lower case letter");
		} else
		{	System.out.println( c1 + " is a puctuation mark or symbol");
		}
		char c = IBIO.inputChar("Enter an A~F grade: ");
		c = Character.toLowerCase(c);
		
		switch(c)
		{	case 'a':
				System.out.println("A-Awesome");
				break;
			case 'b':
				System.out.println("B-Pretty good!");
				break;
			case 'c':
				System.out.println("C-Can improve?");
				break;
			case 'd':
				System.out.println("D-Duh!");
				break;
			case 'e':
				System.out.println("E-Eyyyy");
				break;
			case 'f':
				System.out.println("F-Failing much?");
				break;
			default:
				System.out.println("Not a concept grade");
				break;
		}
	}
}

