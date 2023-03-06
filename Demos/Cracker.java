// Problem: guess a 3 digit combination lock

public class Cracker
{
	
	public static void main (String[] args)
	{
		int c = 0;
		for(int d1 = 0; d1 <= 9; d1++)
		{	for(int d2 = 0; d2 <= 9; d2++)
			{	for(int d3 = 0; d3 <= 9; d3++)
				{	System.out.println(d1 + " " + d2 + " " + d3);
					c++;
				}
			}
		}
		System.out.println(c);
	}
}

