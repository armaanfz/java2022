/*
 * Try removing the break; statements to
 * see what happens!
 * 
 */
 
public class Chapter4Example2
{
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("Enter a number: ");
		switch(num)
		{	case 0:

			case 1:

			case 2:
				System.out.println("Low");
				break;
			case 3:

			case 4:

			case 5:
				System.out.println("mid");
				break;
			case 6:

			case 7:

			case 8:

			case 9:
				System.out.println("high");
				break;
			default:
				System.out.println("Not a number between 0 and 9");
				break;
		}
		char c = IBIO.inputChar("Enter a character: ");
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
		num = IBIO.inputInt("Enter a number: ");
		switch(num)
		{	case 2:
				System.out.println("2");
				break;
			case 1:
				System.out.println("1");
				break;
			case 3:
				System.out.println("3");
				break;
			case 0:
				System.out.println("0");
				break;
			
		}
	}
}

