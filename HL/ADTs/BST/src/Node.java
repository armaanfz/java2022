public class Node
{
    Node left;
    String key; // data
    Node right;

    public Node() { }

    public Node(String key)
    {
        this.key = key;
        this.left= null;
        this.right = null;
    }

    public String toString()
    {
        return key;
    }

}
