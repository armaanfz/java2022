/*
Write a program that will add up the sequence
1/1 + 1/4 + 1/9 + 1/16 + 1/25 + ... for 100 terms. (1.6348839001848923)
*/
public class Chapter5Problem2
{
	public static void main (String[] args)
	{
		double sum = 0;
		double denom = 1.0;
		double term = 0;
		for(int i = 1; i <= 100; i++)
		{
			denom = i * i;
			term = 1.0/denom;
			sum = sum + term;
		}
		System.out.println(sum);
		
	}
}

