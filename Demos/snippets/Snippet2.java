/*	Java snippets template class
	extends IBIO is a shortcut to avoid typing IBIO. in front of...
	IBIO methods, but it's not recommended to use it often.
*/

public class Snippet2 extends IBIO
{
	public static void main(String[] args)
	{
		// snippet code goes here...
		// we loop this code 5 times to enter 120, 100, 70, 20 and 5
		for(int i = 0; i < 5; i++)
		{
			int mark = inputInt("(enter 120, 100, 70, 20 and 5) >>> Enter mark = ");
			switch(mark/10)
			{
				 case 10:
				 case 9:
				 case 8:
					   System.out.println("Excellent");
					   break;
				 case 7:
					   System.out.println("Very Good");
					   break;
				 case 6:
					   System.out.println("Good");
					   break;
				 case 5:
					   System.out.println("Work Hard");
					   break;
				 case 4:
					   System.out.println("Poor");
					   break;
				 case 3:
				 case 2:
				 case 1:
				 case 0:
					   System.out.println("Very Poor");
					   break;
				 default:
					   System.out.println("Invalid value Entered");
					   break;
			}
		}
		
	} 
}