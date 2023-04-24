// This is the definition of a node for an ADT
// Singly-linked
public class Node
{
	int data;
	Node next; // self-reference (Node has another node inside of it)

	// empty constructor creates an empty node
	public Node() { }

	// custom constructor that creates and initialises a node
	public Node(int d)
	{
		this.data = d;
	}

	// is the node linked to another node or does it point to null?
	public boolean hasNext()
	{	return this.next != null;
	}
}

