/*
 * Try removing the break; statements to
 * see what happens!
 * 
 */
 
public class Chapter4Example
{
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("Enter a number: ");
		switch(num)
		{	case 0:
				System.out.println("Cero");
				break;
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
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

