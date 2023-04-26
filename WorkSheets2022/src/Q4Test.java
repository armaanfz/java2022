public class Q4Test
{
    public static int[] clone(int[] a)
    {
        int[] x = new int[a.length];
        //noinspection ManualArrayCopy
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        return x;
    }

    public static String[] clone(String[] a)
    {
        String[] x = new String[a.length];
        //noinspection ManualArrayCopy
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        return x;
    }

    public static void printArray(String[] array)
    {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("[%d]%-2s\n", i, array[i]);
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf( "[%d]%-2d\n", i, array[i]);
        }
        System.out.println();
    }

    public static void parallelPrint(String[] sa, int[] ia)
    {
        for(int i = 0; i < sa.length; i++) {
//            System.out.print( "[" + i + "]" + sa[i]);
//            System.out.println("    " + ia[i]);
            System.out.printf("%-9s %4d\n", sa[i], ia[i]);
        }
        System.out.println();
    }

    public static boolean areParallel(String[] sa, int[] ia)
    {
        return sa.length == ia.length;
    }

    public static void search(String[] sa, int[] ia, int goals)
    {
        for (int i = 0; i < ia.length; i++) {
            if (ia[i] > goals) {
                System.out.printf("%-9s %4d\n", sa[i], ia[i]);
            }
        }
    }

    public static void selectionSort(String[] sa)
    {
        for (int i = 0; i < sa.length -1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < sa.length; j++) {
                if ((sa[j].compareTo(sa[smallestIndex])) < 0) {
                    smallestIndex = j;
                }
            }
            String temp = sa[smallestIndex];
            sa[smallestIndex] = sa[i];
            sa[i] = temp;
        }
    }

    public static void bubbleSort(int[] a)
    {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void parallelSelectionSort(String[] sa, int[] ia)
    {
        for (int i = 0; i < sa.length -1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < sa.length; j++) {
                if ((sa[j].compareTo(sa[smallestIndex])) < 0) {
                    smallestIndex = j;
                }
            }
            String temp = sa[smallestIndex];
            int temp2 = ia[smallestIndex];
            sa[smallestIndex] = sa[i];
            ia[smallestIndex] = ia[i];
            sa[i] = temp;
            ia[i] = temp2;
        }
    }

    public static void parallelBubbleSort(String[] sa, int[] ia)
    {
        int temp;
        String temp2;
        for (int i = 0; i < ia.length; i++) {
            for (int j = 0; j < ia.length - i - 1; j++) {
                if (ia[j] < ia[j + 1]) {
                    temp = ia[j];
                    temp2 = sa[j];
                    ia[j] = ia[j + 1];
                    sa[j] = sa[j + 1];
                    ia[j + 1] = temp;
                    sa[j + 1] = temp2;
                }
            }
        }
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
        System.out.println("\nPlayers by name");
        parallelPrint(players3, records3);
        // +: beautify the output
    }
}