/*
 * Sorting algos in Java
 *
 */


public class SortingAlgos
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-2d  ",i , a[i]);
		}
		System.out.println();
	}

	public static int[] clone(int[] a)
	{
		int[] x = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(int[] a)
	{
		int c = 0;
		int currentIndex = 0;
		while( currentIndex < a.length - 1 )
		{
			int smallestIndex = currentIndex;
			int smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				c++;
				if(a[checkIndex] < smallestValue)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			currentIndex++;
			System.out.print("\t");
			printArray(a);
		}
		System.out.println("Number of comparisons made: " + c);
	}

	public static void bubbleSort(int[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf
		boolean swapped = true;
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		int sorted = 0; // how many elements we have sorted/bubbled up
		while (swapped) // we use swapped to check if we have to make any changes (swaps) in the array
		{
			swapped = false; // assume no swaps are made
			for(int i = 0; i < a.length-1-sorted; i++) // go through the unsorted part of the array (a pass)
			{
				c++;
				if(a[i] > a[i+1]) // if the elements are not in order (ascending)
				{
					int temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true; // and keep track of the fact that we've done a swap
				}
				System.out.print("\t"); printArray(a); // optional, shows how the array changes with each swap
			}
			sorted++; // after each pass, one more element will be sorted
		}
		System.out.println("Number of comparisons made: " + c);
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(int[] array)
	{	int c = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			int temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > temp)
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
		int[] original = { 12, 7, 14, 9, 5, 3 };
		int[] selection = clone(original);
		int[] bubble = clone(original);
		int[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nBubble sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
	}
}
