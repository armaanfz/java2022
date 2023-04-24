import java.util.Stack; // use Java built-in stack

public class DenaryToBinary
{
    public static void int2bin(int n)
    {
        Stack binary = new Stack();
        n = Math.abs(n); // ignore sign (if -, ignore)
        while(n != 0)
        {
            binary.push(n % 2);
            n = n / 2;
        }
        while(!binary.isEmpty())
        {
            System.out.print(binary.pop());
        }
    }

    // Here we use the stack class we coded (stack+node)
    public static String int2binString(int n)
    {
        Stack binary = new Stack();
        n = Math.abs(n); // ignore sign (if -, ignore)
        while(n != 0)
        {
            binary.push(n % 2);
            n = n / 2;
        }
        String bin = "";
        while(!binary.isEmpty())
        {
            bin = bin + binary.pop();
        }
        return bin;
    }


    public static String int2binString2(int n)
    {
        // using Java's built-in Stack (from java.util.) note--it does not...
        // accept primitives, that's why we have to use the wrapper class...
        // called Integer. The < > tells the Java Stack class what the stack...
        // object will contain/be made of
        Stack<Integer> binary = new Stack<>();
        n = Math.abs(n); // ignore sign (if -, ignore)
        while(n != 0)
        {
            binary.push(n % 2);
            n = n / 2;
        }
        String bin = "";
        while(!binary.isEmpty())
        {
            bin = bin + binary.pop();
        }
        return bin;
    }

    public static void main(String[] args)
    {
        System.out.print("46 = ");
        int2bin(46);
        System.out.println(" in binary");

        System.out.println( "46 = " + int2binString(46) + " in binary");


        System.out.println( "46 = " + int2binString2(46) + " in binary");

        System.out.println("\nAnother example of stacks in Java\nPushing...");
        Stack<String> namesStack = new Stack<>();
        namesStack.push("Anna"); namesStack.push("Dani");
        namesStack.push("Juan"); namesStack.push("Esteban");
        namesStack.push("Pepe");
        System.out.println( namesStack );
        System.out.println( "Stack size = " + namesStack.size() );
        System.out.println("Popping...");
        while(namesStack.iterator().hasNext())
        // in exams, you would write the line above as namesStack.hasNext() //
        {
            System.out.print( namesStack.pop() + " " );
        }
    }
}
