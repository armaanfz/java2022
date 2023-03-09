
public class Q3TestAQ
{
	
	public static void printArray(double[] a)
	{
		for(int i = 0; i < a.length; i++)
		{	System.out.printf("%.1f    ", a[i]);
		}
		System.out.println();
	}
	
	public static double[] calculateThreePointMovingAverage(double[] inArray)
	{
		int n = inArray.length;
		double[] outArray = new double[n];
		for(int i = 1; i < n-1; i++)
		{
			outArray[i] = inArray[i-1] + inArray[i] + inArray[i+1];
			outArray[i] = outArray[i] / 3.0;
			printArray(outArray);
		}
		outArray[0] = (inArray[0] + inArray[1]) / 2.0;
		outArray[n-1] = (inArray[n-2] + inArray[n-1]) / 2.0;
		printArray(outArray);
		return outArray;
	}
	
	
	public static void main (String[] args)
	{
		double[] data = { -2,2,4,3,0,-1 };
		printArray(data);
		double[] d = calculateThreePointMovingAverage(data);
		System.out.println("\nResult:");
		printArray(d);
	}
}

