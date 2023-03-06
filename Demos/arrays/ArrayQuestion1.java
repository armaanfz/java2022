/*
 * Practice question #1 for written test #2
 * Quarter 3 Grade 11
 *  https://www.baeldung.com/java-printstream-printf
 * https://www.digitalocean.com/community/tutorials/java-printf-method
 * 
 */
public class ArrayQuestion1
{
	public static void printArray(String[] a)
	{
		//System.out.print( "Start -->");
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf("%d:%-6s  ", i, a[i]);
		}
		System.out.println();
	}
	
	
	public static void main (String[] args)
	{
		String[] names = {"Robert","Boris","Brad","George","David"};
		int n = names.length, k = 0;
		System.out.print("Original ");
		printArray(names);
		while(k < n-1)
		{	System.out.printf("K = %d >> ", k);
			String temp = names[k];
			names[k] = names[n-k-1];
			names[n-k-1] = temp;
			printArray(names);
			k++;
		}
		
		
	}
}

