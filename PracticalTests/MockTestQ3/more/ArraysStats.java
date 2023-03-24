import java.util.Arrays;

public class ArraysFormative
{
	// List all elements in array
	public static void list(double[] array)
	{
		// your code goes here
	}
	//------------------------------------------------------------------
	
	// Minimum:
	public static double min(double[] array)
	{
		// your code goes here
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		// your code goes here
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		// your code goes here
	}
	//------------------------------------------------------------------
		
	public static double mean(double[] array)
	{
		// your code goes here
	}

	// Mode:
	public static double mode(double array[])
	{
		// your code goes here
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(data);	// sorts data set to make it easier for you to
							// find the median
		// your code goes here
	}
	//------------------------------------------------------------------

	public static void main (String args[])
	{
		System.out.println();
		System.out.println("*** Statistical Analysis of Data Set ***\n");
		
		double data[] = { 29, 39, 40, 56, 3, 5, 14, 21, 23, 7, 12, 13, 23, 23, 23  };

		System.out.println( "Minimum: " + min(data) );
		System.out.println( "Maximum: " + max(data) );
		System.out.println( "Range  : " + range(data );
		System.out.println( "Mean   : " + mean(data) );
		System.out.println( "Median : " + median(data) );
		System.out.println( "Mode   : " + mode(data) );
		System.out.println();
		
	}
}

/********************
 * EXPECTED RESULTS *
 ********************
 
*** Statistical Analysis of Data Set ***

29.0  39.0  40.0  56.0  3.0  5.0  14.0  21.0  23.0  7.0  12.0  13.0  23.0  23.0  23.0  

Minimum: 3.0
Maximum: 56.0
Range  : 53.0
Mean   : 22.066666666666666
Median : 23.0
Mode   : 23.0

*/
