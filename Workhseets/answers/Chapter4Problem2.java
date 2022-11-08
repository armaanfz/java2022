/*
 Write a program that will add up the sequence
1*7 + 2*2 - 3*5 + 4*7 + 5*2 - 6*5 + 7*7 + 8*2 - 9*5 + 10*7 + ... 1000
Note that the there are three cases. First calculate the remainder when divided by 3. x%3. If the
remainder is 0 then the number gets multiplied by -5, if the remainder is 1 then the number is
multiplied by 7 and if the remainder is 2 then the number is multiplied by 2. (669004)
 */

public class Chapter4Problem2
{
	
	public static void main (String[] args)
	{
		int sum = 0;
		for(int x = 1; x <= 1000; x++)
		{	int y = x % 3;
			IBIO.out("x = " + x + "  |  x % 3 = " + y + "  |  ");
			switch( y )
			{	case 0:
					IBIO.output( x * -5 );
					sum = sum + (x * -5);
					break;
				case 1:
					IBIO.output( x * 7 );
					sum = sum + (x * 7);
					break;
				case 2:
					IBIO.output( x * 2 );
					sum = sum + (x * 2);
					break;
			} // end switch
		} // end for x
		System.out.println(sum);
	}
}

