/*
 * Sorting algos in Java
 *
 */
public class SortingAlgos {
    private static int c = 0;

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.printf( "[%d]%-2d  ",i , a[i]);
        }
        System.out.println();
    }

    private static void printStringArray(String[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print( "[" + i + "]" + a[i] + "  ");
        }
        System.out.println();
    }

    public static int[] clone(int[] a) {
        int[] x = new int[a.length];
        //noinspection ManualArrayCopy
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        return x;
    }

    private static String[] cloneString(String[] a) {
        String[] x = new String[a.length];
        //noinspection ManualArrayCopy
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        return x;
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int minPos = i;
            int smallestValue = a[minPos];
            int checkIndex = minPos + 1;
            while( checkIndex < a.length ) {
                if(a[checkIndex] < smallestValue) {
                    minPos = checkIndex;
                    smallestValue = a[checkIndex];
                }
                checkIndex++;
            }
            a[minPos] = a[i];
            a[i] = smallestValue;
            System.out.print("\t");
            printArray(a);
        }
    }

    private static void selectionString(String[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if ((a[j].compareTo(a[minPos])) < 0) {
                    minPos = j;
                }
            }
            String temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
            System.out.print("\t");
            printStringArray(a);
        }
    }

    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("\t");
            printArray(a);
        }
    }

    private static void bubbleString(String[] a) {
        String temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if ((a[j].compareTo(a[j + 1])) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("\t");
            printStringArray(a);
        }
    }

    public static int minPos(int[] a, int b) {
        int min = a[b];
        int minPos = b;
        for (int i = b; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minPos = i;
            }
            c++;
        }
        return minPos;
    }

    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int currentMin = minPos(a, i);
            int temp = a[currentMin];
            a[currentMin] = a[i];
            a[i] = temp;
            printArray(a);
        }
        System.out.println("counter: " + c);
    }

    public static int binarySearch(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x) {
                return m;
            }
            if (a[m] < x) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }
//  Recursive Binary Search
    /*public static int binarySearch(int[] a, int l, int r, int x) {
        if (l <= r) {
            int m = l + ((r-l) / 2);
            if (a[m] == x) {
                return m;
            }
            if (a[m] < x) {
                return binarySearch(a, m+1, r, x);
            }
            else {
                return binarySearch(a, l, m-1, x);
            }
        }
        return -1;
    }*/

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void input() {
        String startCase = IBIO.inputString("Do you want to work with string arrays or integer arrays (str/int)? ");
        if (startCase.equalsIgnoreCase("int") || startCase.equalsIgnoreCase("integer")) {
            integerSorting();
        }
        else if (startCase.equalsIgnoreCase("str") || startCase.equalsIgnoreCase("string")){
            stringSorting();
        }
        else {
            System.out.println("Error - Please type in your choice correctly");
            input();
        }
    }

    public static void integerSorting () {
        int[] original = {12, 7, 14, 9, 5, 3};
        int[] selection = clone(original);
        int[] bubble = clone(original);
        int[] insert = clone(original);
        int[] linear = clone(original);
        System.out.println("\nOriginal array:");
        printArray(original);
        System.out.println("\nSelection sort:");
        selectionSort(selection);
        System.out.println("\nFinal result:");
        printArray(selection);
        System.out.println("\nBubble sort:");
        bubbleSort(bubble);
        System.out.println("\nFinal result:");
        printArray(bubble);
        System.out.println("\nInsertion sort:");
        insertionSort(insert);
        System.out.println("\nFinal result:");
        printArray(insert);

        System.out.println("\n\nSorted array:");
        printArray(bubble);
        int target = IBIO.inputInt("Binary search for number: ");
        int binaryResult = binarySearch(bubble, target);
        System.out.println("\nElement " + target + " is present at index " + binaryResult);

        System.out.println("\nOriginal array:");
        printArray(original);
        int linearTarget = IBIO.inputInt("Linear search for number: ");
        int linearResult = linearSearch(linear, linearTarget);
        System.out.println("\nElement " + linearTarget + " is present at index " + linearResult);
    }
    public static void stringSorting () {
        String[] original = {"Velma", "Bones", "Frank", "Han", "Jack"};
        String[] selection = cloneString(original);
        String[] selectionParallel = cloneString(original);
        String[] bubble  = cloneString(original);
        String[] bubbleParallel = cloneString(original);
        int[] height = {169, 158, 201, 183, 172};
        int[] selectionHeight = clone(height);
        int[] bubbleHeight = clone(height);

        System.out.println("\nOriginal array:");
        printStringArray(original);
        System.out.println("\nSelection sort:");
        selectionString(selection);
        System.out.println("\nFinal result:");
        printStringArray(selection);
        System.out.println("\nBubble sort:");
        bubbleString(bubble);
        System.out.println("\nFinal result:");
        printStringArray(bubble);

        System.out.println("\nOriginal Parallel arrays:");
        printStringArray(original);
        printArray(height);
        System.out.println("\nSelection Sorting Parallel:");
        selectionParallel(selectionParallel, selectionHeight);
        System.out.println("\nFinal result:");
        printStringArray(selectionParallel);
        printArray(selectionHeight);
        System.out.println("\nBubble Sorting Parallel:");
        bubbleParallel(bubbleParallel, bubbleHeight);
        System.out.println("\nFinal result:");
        printStringArray(bubbleParallel);
        printArray(bubbleHeight);
    }

    private static void selectionParallel(String[] a, int[] b) {
        for (int i = 0; i < a.length -1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if ((a[j].compareTo(a[minPos])) < 0) {
                    minPos = j;
                }
            }
            String temp = a[minPos];
            int temp2 = b[minPos];
            a[minPos] = a[i];
            b[minPos] = b[i];
            a[i] = temp;
            b[i] = temp2;
            System.out.print("\t");
            printStringArray(a);
            System.out.print("\t");
            printArray(b);
        }
    }
    private static void bubbleParallel(String[] a, int[] b) {
        String temp;
        int temp2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if ((a[j].compareTo(a[j + 1])) > 0) {
                    temp = a[j];
                    temp2 = b[j];
                    a[j] = a[j + 1];
                    b[j] = b[j + 1];
                    a[j + 1] = temp;
                    b[j + 1] = temp2;
                }
            }
            System.out.print("\t");
            printStringArray(a);
            System.out.print("\t");
            printArray(b);
        }
    }
    public static void main (String[] args) {
        input();
    }
}
