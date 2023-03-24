
public class DiceRoll {
	
	static final int MAXROLLS = 100;
	static final int MAXSIDES = 8;
	
	public static int randInt(int n)
	{
		int r = (int)((Math.random() * n) + 1);
		return r;
	}
	public static void main (String[] args) {
		System.out.println("This program simulates " + MAXROLLS + " rolls of a " + MAXSIDES + " sided dice\n");
		int[] rolls = new int[MAXROLLS];
		int[] stats = new int[MAXSIDES]; // array with results per side of the dice, can be used to analyse the number of rolls per side (index = side-1)
		// first we roll the dice
		for(int i = 0; i < MAXROLLS; i++)
		{	int roll = randInt(MAXSIDES);
			rolls[i] = roll;
			//System.out.println( roll );
		}
		
		for(int side = 1; side <= MAXSIDES; side++)
		{	System.out.print( side + " ");
			int c = 0;
			for(int r = 0; r < MAXROLLS; r++)
			{	if( rolls[r] == side )
				{	System.out.print("X");
					c++;
				}
			}
			stats[side-1] = c;
			System.out.println("    " + c);
		}
		System.out.println();
		
		printArray(stats);
		
		/* // This is the way I'd personally code it (mr Marcos)
		for(int side = 0; side < MAXSIDES; side++)
		{	System.out.print( (side+1) + " ");
			int c = 0;
			for(int r = 0; r < MAXROLLS; r++)
			{	if( rolls[r] == side+1 )
				{	System.out.print("X");
					c++;
				}
			}
			stats[side] = c;
			System.out.println("    " + c);
		}
		*/		
	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{	System.out.println(i + " : " + a[i]);
		}
	}
}


