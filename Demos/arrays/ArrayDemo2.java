
public class ArrayDemo2
{	// global constant:
	private static final int MAXSIZE = 5;
	public static int currentSize = 0;
	
	// method: return type/method name/parameter
	public static void printArray(int[] array)
	{
		if(array.length > 0)
		{	for(int index = 0; index < array.length; index++)
			{	System.out.println("[" + index + "] " + array[index]);
			}
		} else {
			System.out.println("nothing inside of numbers array");
		}
	}
	
	public static void print(int[] array)
	{
		if(currentSize > 0)
		{	System.out.println("\n\tpopulation: " + currentSize);
			for(int index = 0; index < currentSize; index++)
			{	System.out.println("[" + index + "] " + array[index]);
			}
		} else {
			System.out.println("nothing inside of numbers array");
		}
	}
	
	
	// populate the array
	public static void addNumber(int[] array)
	{
		System.out.print("Enter integer #" + (currentSize+1) + ": ");
		array[currentSize] = IBIO.inputInt();
		currentSize++;
		printArray(array);
	}
	
	public static double averageArray(int[] array)
	{
		double average = 0;
		for(int index = 0; index < currentSize; index++)
		{
			average = average + array[index];
		}
		average = average / currentSize;
		return average;
	}
	
	public static void main (String[] args)
	{
		int[] numbers; // declaration
		numbers = new int[MAXSIZE]; // initialisation
		//System.out.println(numbers);
		// arrays are passed by reference to methods
		printArray(numbers);
		addNumber(numbers);
		addNumber(numbers);
		addNumber(numbers);
		//addNumber(numbers);
		//addNumber(numbers);
		print(numbers);
		double average = averageArray(numbers) ;
		System.out.println( "Average = " + average );

	}
}

