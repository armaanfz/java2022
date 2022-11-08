public class Counting
{
    public static void countDown(int n)
    {
        IBIO.out(n + " ");
        if (n <= 1)
        {
            return;
        } else
        {
            countDown(n - 1);
        }
    }
    public static void count(int n)
    {
        if (n < 1)
        {
            return;
        } else
        {
            count(n - 1);
        }
        IBIO.out(n + " ");
    }
    public static void main(String[] args)
    {
        System.out.println();
        count(4);
        System.out.println();
        countDown(4);
    }
}
