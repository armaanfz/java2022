
public class Stack
{
	Node top = null;
	
	public boolean isEmpty()
	{
		if( top == null )
			return true;
		else
			return false;
		// alternatively, return top==null;
	}
	
	// public void push(Node newNode) OR
	public void push(int d)
	{	// the next 3 lines create a node with the argument of push (d)
		Node newNode = new Node();
		newNode.data = d;
		newNode.next = null;
		
		if( isEmpty() )
			top = newNode;
		else
		{	newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int d = top.data;
			top = top.next;
			return d;
		} else {
			System.out.println("Stack is empty.");
			return 0;
		}
	}
	
	public void printStack()
	{
		Node temp = top;
		System.out.print("top -> ");
		while( temp != null )
		{
			System.out.print(temp.data);
			System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}

