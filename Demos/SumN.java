// Add any amount of numbers until you input 0
// No negatives allowed, though.

public class SumN
{
	
	public static void main (String[] args)
	{
		double sum	= 0;
		double x	= 0;
		do
		{
			do
			{	x = IBIO.inputDouble("Enter a number: ");
				if(x < 0)
					IBIO.output("The number must be +");
			} while(x < 0); // reject -s
			if(x != 0)
			{	sum = sum + x;
			}
		} while(x != 0);	
		IBIO.output(sum);
	}
}

