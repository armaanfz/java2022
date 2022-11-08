/*
Write a program that will add up the sequence
1/5 + 1/25 + 1/125 + 1/625 + … for 100 terms. (0.25)
*/
public class Chapter5Problem1
{
	public static void main (String[] args)
	{
		double sum = 0;
		double denom = 5.0;
		double term = 0;
		for(int i = 1; i <= 100; i++)
		{	term = 1.0/denom;
			sum = sum + term;
			denom = denom * 5;
		}
		System.out.println(sum);
		
	}
}

