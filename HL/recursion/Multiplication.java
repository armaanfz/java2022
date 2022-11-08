import java.util.Scanner;

public class Multiplication
{
	public static long mult(int n, int m)
	{	if(m == 1)
		{	return n;
		}
		return n + mult(n, m - 1);
	}
	
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = input.nextInt();
		System.out.print("Enter m = ");
		int m = input.nextInt();
		
		input.close();
		System.out.print(n + " x " + m + " = ");
		System.out.println( mult(n, m) );
	}
}

