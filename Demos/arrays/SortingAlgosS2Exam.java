/*
 * Sorting algos in Java
 * String version
 */


public class SortingAlgosS2Exam
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-3d  ",i , a[i]);
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

	public static void selectionSortAsc(int[] a)
	{
		int c = 0;
		for(int currentIndex = 0; currentIndex < a.length - 1; currentIndex++)
		{
			int smallestIndex = currentIndex;
			for(int checkIndex= smallestIndex + 1; checkIndex < a.length; checkIndex++ )
			{
				c++;
				if(a[checkIndex] < a[smallestIndex])
				{
					smallestIndex = checkIndex;
				}
			}
			int smallestValue = a[smallestIndex];
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			System.out.print("\t"); printArray(a);
		}
		System.out.println("Number of comparisons made: " + c);
	}

public static void selectionSortDsc(int[] a)
	{
		int c = 0;
		for(int currentIndex = 0; currentIndex < a.length - 1; currentIndex++)
		{
			int largestIndex = currentIndex;
			for(int checkIndex= largestIndex + 1; checkIndex < a.length; checkIndex++ )
			{
				c++;
				if(a[checkIndex] > a[largestIndex])
				{
					largestIndex = checkIndex;
				}
			}
			int largestValue = a[largestIndex];
			a[largestIndex] = a[currentIndex];
			a[currentIndex] = largestValue;
			System.out.print("\t"); printArray(a);
		}
		System.out.println("Number of comparisons made: " + c);
	}

	public static void bubbleSortB(int[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf
		boolean swapped = true;
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		//int sorted = 0; // how many elements we have sorted/bubbled up
		while (swapped) // we use swapped to check if we have to make any changes (swaps) in the array
		{
			swapped = false; // assume no swaps are made
			for(int i = 0; i < a.length-1; i++) // go through the unsorted part of the array (a pass)
			{
				c++;
				if(a[i] > a[i+1]) // if the elements are not in order (ascending)
				{
					int temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true; // and keep track of the fact that we've done a swap
				}
				System.out.print("\t>>> i=" + i + " "); printArray(a); // optional, shows how the array changes with each swap
			}
			//sorted++; // after each pass, one more element will be sorted
			//System.out.print("\t"); printArray(a); // optional, shows how the array changes with each pass
		}
		System.out.println("Number of comparisons made: " + c);
	}

	public static void bubbleSortA(int[] a)
	{
		int c = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		//int sorted = 0; // how many elements we have sorted/bubbled up
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length-1; i++)
			{
				c++;
				if(a[i] > a[i+1]) // if the elements are not in order (ascending)
				{
					int temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				System.out.print("\t>>> i=" + i + " "); printArray(a); // optional, shows how the array changes with each swap
			}
			//sorted++; // after each pass, one more element will be sorted
			//System.out.print("\t"); printArray(a); // optional, shows how the array changes with each pass
		}
		System.out.println("Number of comparisons made: " + c);
	}
	

	public static void main (String[] args)
	{
		int[] original = { 12, 52, 16, 42, 88, 86 };
		int[] reversed = { 88, 86, 52, 42, 16, 12 };
		int[] selectionAsc = clone(original);
		int[] selectionDsc = clone(original);
		int[] bubbleA = clone(original);
		int[] bubbleB = clone(original);
		int[] bubbleADesc = clone(reversed);
		int[] bubbleBDesc = clone(reversed);
	
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort asc. :");
		selectionSortDsc(selectionAsc);
		System.out.println("\nFinal result:");
		printArray(selectionAsc);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort desc.:");
		selectionSortDsc(selectionDsc);
		System.out.println("\nFinal result:");
		printArray(selectionAsc);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble A sort:");
		bubbleSortA(bubbleA);
		System.out.println("\nFinal result:");
		printArray(bubbleA);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble B (partially optimised) sort:");
		bubbleSortB(bubbleB);
		System.out.println("\nFinal result:");
		printArray(bubbleB);
		System.out.println("\nBubble A sort:");
		bubbleSortA(bubbleADesc);
		System.out.println("\nFinal result:");
		printArray(bubbleADesc);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble B (partially optimised) sort:");
		bubbleSortB(bubbleBDesc);
		System.out.println("\nFinal result:");
		printArray(bubbleBDesc);
	}
}
