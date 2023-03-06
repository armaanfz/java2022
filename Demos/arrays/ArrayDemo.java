
public class ArrayDemo 
{	// global constant:
	private static final int MAXSIZE = 4;
	
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
	
	public static int add1(int x)
	{	x = x + 1;
		return x;
	}
	
	// populate the array
	public static void inputArray(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			System.out.print("Enter integer #" + (index+1) + ": ");
			array[index] = IBIO.inputInt();
			printArray(array);
		}
	}
	
	public static double averageArray(int[] array)
	{
		double average = 0;
		for(int index = 0; index < array.length; index++)
		{
			average = average + array[index];
		}
		average = average / array.length;
		return average;
	}
	
	public static void main (String[] args)
	{
		int[] numbers; // declaration
		numbers = new int[MAXSIZE]; // initialisation
		//System.out.println(numbers);
		// arrays are passed by reference to methods
		printArray(numbers);
		inputArray(numbers);
		printArray(numbers);
		double average = averageArray(numbers) ;
		System.out.println( "Average = " + average );
		// example of primitives being passed by value as method parameters
		int x = 5;
		System.out.println( add1(x) );
		System.out.println( x );
	}
}

