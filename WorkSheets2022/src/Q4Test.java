import java.util.Stack;

public class Q4Test
{
    public static int[] clone(int[] a)
    {
        return null; // change...
    }

    public static String[] clone(String[] a)
    {
        return null; // change...
    }

    public static void printArray(String[] array)
    {

    }

    public static void printArray(int[] array)
    {

    }

    public static void parallelPrint(String[] sa, int[] ia)
    {

    }

    // true if arrays may be parallel, false otherwise
    public static boolean areParallel(String[] sa, int[] ia)
    {
        return false; // change...
    }

    public static void search(String[] sa, int[] ia, int goals)
    {

    }

    public static void selectionSort(String[] sa)
    {

    }

    public static void bubbleSort(int[] array)
    {

    }

    public static void parallelSelectionSort(String[] sa, int[] ia)
    {

    }

    public static void parallelBubbleSort(String[] sa, int[] ia)
    {

    }


    public static void main(String[] args)
    {
        String[] bad = {"Cow", "Chicken", "Johnny", "Diddy", "Dexter"};
        String[] originalPlayers = {"Perpetua", "Maribel", "Homare", "Lotta", "Eugenie", "Vivianne", "Portia",
                "SunWen", "Patrizia", "Marta", "Julie", "Birgit", "Maysah", "Abby", "Christine"};
        int[] originalRecords = {80, 82, 83, 88, 88, 95, 101, 106, 110, 115, 116, 128, 130, 184, 190};
        String[] players1 = clone(originalPlayers); // clone = #1
        int[] records1 = clone(originalRecords);
        String[] players2 = clone(originalPlayers);
        int[] records2 = clone(originalRecords);
        String[] players3 = clone(originalPlayers);
        int[] records3 = clone(originalRecords);

        System.out.println("\nPrint player names array");
        printArray(players1); // 2
        System.out.println("\n\nPrint array of goals");
        printArray(records1); // 3
        System.out.print("\n\nCheck if the arrays are parallel: ");
        if( !areParallel(bad, records1) ) // 4 areParallel
        {
            System.out.println("Error-Arrays are not parallel");
        }
        System.out.println("\nPrint parallel arrays");
        parallelPrint(players1, records1); // 5
        System.out.println("\nPlayers with 120 goals or more by name (linear search)");
        search(players3, records3, 120); // 6
        System.out.println("\nSort players alphabetically with selection sort");
        selectionSort(players1); // 7
        printArray(players1);
        System.out.println("\n\nSort records by most goals using bubble sort");
        bubbleSort(records1); // 8
        printArray(records1);
        System.out.println("\n\nSort parallel arrays by most goals using bubble sort");
        parallelBubbleSort(players2, records2); // 9
        System.out.println("Top scorers");
        parallelPrint(players2, records2);
        System.out.println("\nSort parallel arrays by player names with selection sort");
        parallelSelectionSort(players3, records3); // 10
        System.out.println("Players by name");
        parallelPrint(players3, records3);
        // +: beautify the output
    }
}
