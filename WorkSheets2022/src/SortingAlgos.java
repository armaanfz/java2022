/*
 * Sorting algos in Java
 *
 */


public class SortingAlgos {
	private static int c = 0;
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
		for (int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length -1; i++) {
			int smallestIndex = i;
			int smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				if(a[checkIndex] < smallestValue)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[i];
			a[i] = smallestValue;
			System.out.print("\t");
			printArray(a);
		}
	}

	public static void bubbleSort(int[] a)
	{
		int temp;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				counter++;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			printArray(a);
		}
		System.out.print("counter: " + counter + "\n");
	}
	public static int minPos(int[] a, int b) {
		int min = a[b];
		int minPos = b;
		for (int i = b; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minPos = i;
			}
			c++;
		}
		return minPos;
	}

	public static void insertionSort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++) {
			int currentMin = minPos(a, i);
			int temp = a[currentMin];
			a[currentMin] = a[i];
			a[i] = temp;
			printArray(a);
		}
		System.out.print("counter: " + c + "\n");
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
