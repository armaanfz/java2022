// this example reverses an array using a stack
public class StackDemo
{
	
	public static void main (String[] args)
	{	int i = 0;
		Stack s = new Stack();
		int[] numbers = { 9,7,5,3,1 };
		printArray(numbers);
		System.out.println("Populating the stack with the array (pushing)");
		for(i = 0; i < numbers.length; i++)
		{	s.push(numbers[i]);
			s.printStack();
		}
		System.out.println("\nRe-populating the array with the stack (popping)");
		i = 0;
		while(!s.isEmpty())
		{	numbers[i] = s.pop();
			s.printStack();
			printArray(numbers);
			i++;
		}
	}
	
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
}

