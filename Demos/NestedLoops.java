// Problem: guess a 3 digit combination lock

public class NestedLoops
{	// line 5 is how we make CONSTANTS in Java
	static final int MAX = 1;
	
	public static void main (String[] args)
	{
		int c = 0;
		for(int d1 = 0; d1 <= MAX; d1++)
		{	for(int d2 = 0; d2 <= MAX; d2++)
			{	for(int d3 = 0; d3 <= MAX; d3++)
				{	System.out.println(d1 + " " + d2 + " " + d3);
					c++;
				}
			}
		}
		System.out.println(c);
		System.out.println("\nNo duplicates!");
		
		c = 0;
		for(int d1 = 0; d1 <= MAX; d1++)
		{	for(int d2 = d1; d2 <= MAX; d2++)
			{	for(int d3 = d2; d3 <= MAX; d3++)
				{	System.out.println(d1 + " " + d2 + " " + d3);
					c++;
				}
			}
		}
		System.out.println(c);
	}
}

