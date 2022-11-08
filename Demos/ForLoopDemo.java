
public class ForLoopDemo
{
	
	public static void main (String[] args)
	{
		int i;
		for(i = 0; i < 11; i++)
		{	System.out.print(i + " ");
		}
		
		System.out.println("\n" + i);
		/* OR
		System.out.println();
		System.out.println(i);
		*/
		System.out.println("---------------");
		for(int j = 10; j >= 0; j--)
		{	System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("---------------");
		for(int j = 0; j < 21; j=j+2)
		{	System.out.print(j + " ");
		}
	}
}

