/*
 * Searching algos in Java
 * String version
 */


public class SearchingAlgosString
{
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-7s  ",i , a[i]);
		}
		System.out.println();
	}

	public static String[] clone(String[] a)
	{
		String[] x = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static int linearSearch(String[] a, String key)
	{
		int c = 0;
		int index = -1; // not found (yet?)
		for(int i = 0; i < a.length; i++)
		{
			c++;
			if(key.equalsIgnoreCase(a[i]) )
			{	index = i;
				break; //exit the loop, stop searching
			}
		}
		System.out.print(c); // how many iterations did it take?
		return index;
	}

	// https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
	public static int binarySearch(String[] array, String key)
	{
		int c = 0;
		int index = -1;	// not found
		int lower = 0;		// index of first/lowest element to check
		int upper = array.length - 1; // index of last/highest element to check
		System.out.println("\t\tlower index: " + lower + " upper index: " + upper + " midpoint: "+ (lower+upper)/2 );
		while( lower <= upper )
		{	c++;
			int mid = (lower + upper) / 2;
			System.out.println("\t\tL:" + lower + " U:" + upper + " M:"+ mid);
			if( array[mid].equalsIgnoreCase(key) )
			{	index = mid;
				break; // key found, exit while loop/stop searching
			} else if( key.compareToIgnoreCase(array[mid]) < 0 )
			{	upper = mid - 1;
			} else if( key.compareToIgnoreCase(array[mid]) > 0 ) // this could also be a plain else
			{	lower = mid + 1;
			}
			
		}
		//System.out.println("Comparisons: " + c);
		System.out.print(c);
		return index;
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(String[] array)
	{	int c = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			String temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j].compareTo(temp) > 0)
			{	c++;
				array[j+1] = array[j];
				j--;
				System.out.print("\t>>> ");	printArray(array);
			}
			array[j+1] = temp;
		}
		System.out.println("Comparisons: " + c);
	}

	public static void main (String[] args)
	{
		String[] original = { "Kyle", "Anne", "Cyan", "Maggie", "Zeke", "Lisa" };
		// for additional discussion and testing purposes:
		//int[] original = { 12, 7, 14, 9, 5, 3 };
		//String[] original = { "12", "7", "14", "9", "5", "3" };
		//String[] original = {"Anne", "Cyan", "Kyle", "Lisa", "Maggie", "Zeke"};
		//String[] original = {"Zeke", "Maggie", "Lisa", "Kyle", "Cyan", "Anne"};
		String[] unsorted = clone(original);
		String[] sorted = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nLinear/sequential search on original array:");
		System.out.println("\tlinearSearch(\"john\") = " +
			linearSearch(unsorted, "john") );
		System.out.println("\tlinearSearch(\"Lisa\") = " +
			linearSearch(unsorted, "Lisa") );
		System.out.println("\tlinearSearch(\"kyle\") = " +
			linearSearch(unsorted, "kyle") );
		System.out.println("\nInsertion sort:");
		insertionSort(sorted);
		System.out.println("\nSorted array:");
		printArray(sorted);
		System.out.println("\nBinary search on the sorted array:");
		System.out.println("\tbinarySearch(\"John\") = " +
			binarySearch(sorted, "John") );
		System.out.println("\tbinarySearch(\"lisa\") = " +
			binarySearch(sorted, "lisa") );
		System.out.println("\tbinarySearch(\"kylE\") = " +
			binarySearch(sorted, "kylE") );
		System.out.println("\tbinarySearch(\"zeke\") = " +
			binarySearch(sorted, "zeke") );
		System.out.println("\tbinarySearch(\"Anne\") = " +
			binarySearch(sorted, "Anne") );
	}
}
