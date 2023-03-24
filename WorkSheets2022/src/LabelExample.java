
public class LabelExample
{
	
	public static void main (String[] args)
	{
		mainLoop:
		do
		{	int num = IBIO.inputInt("enter a number ");
			switch ( num )
			{	case 17:
					IBIO.output("correct answer");
					break mainLoop;
				default:
					IBIO.output("wrong");
					break;
			}
		} while (true);
		
		do
		{	int n = IBIO.inputInt("enter a number ");
			switch ( n )
			{	case 17:
					IBIO.output("correct answer");
					break;
				default:
					IBIO.output("wrong");
					break;
			}
			if(n == 17) break;
		} while (true);
	}
}

