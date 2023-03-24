
public class Chapter8Example
{
	static boolean isDiophantine(int a, int b)
	{
		int x = a * b + 1;
		int y = (int) (Math.sqrt(x)+.5);
		return ( y * y == x );
	}
	
	public static void main( String args[])
	{	
		for (int i = 1; i < 100; i++)
		{	for (int j = 1; j < 100; j++)
			{	for (int k = 1; k < 100; k++)
				{
					if ( isDiophantine(i,j) && isDiophantine(j,k) && isDiophantine(i,k) )
					{	IBIO.output( i + " " + j + " " + k );
					}
				}
			}
		}
		
	}
}

