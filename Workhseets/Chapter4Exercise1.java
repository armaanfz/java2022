// Chapter 4.1
public class Chapter4Exercise1
{
	
	public static void main (String[] args)
	{
		// n needs to be declared here to that
		// we can compare it in the while loop
		int n;
		int a = IBIO.inputInt("Enter first number = ");
		int b = IBIO.inputInt("Enter second nuber = ");
		do
		{
			n = IBIO.inputInt("1 +; 2 *; 3 -; 4 /; 5 exits: ");
			switch(n)
			{	case 1:
					System.out.println( a + b );
					break;
				case 2:
					System.out.println( a * b );
					break;
				case 3:
					System.out.println( a - b );
					break;
				case 4:
					System.out.println( a / b );
					break;
				default:
					System.out.println( "1 ~ 4 only, 5 to exit" );
					break;
			}
		} while( n != 5);
		
	}
}

/* original
Enter first number = 2
Enter second nuber = 3
1 +; 2 *; 3 exit: 1
5
1 +; 2 *; 3 exit: 2
6
1 +; 2 *; 3 exit: 0
1 or 2 only, 3 to exit
1 +; 2 *; 3 exit: 3
1 or 2 only, 3 to exit

*/
