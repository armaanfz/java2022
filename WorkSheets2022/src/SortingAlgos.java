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
            int smallestIndex = i;
            int smallestValue = a[smallestIndex];
            int checkIndex = smallestIndex + 1;
            while( checkIndex < a.length ) {
                if(a[checkIndex] < smallestValue) {
                    smallestIndex = checkIndex;
                    smallestValue = a[checkIndex];
                }
                checkIndex++;
            }
            a[smallestIndex] = a[i];
            a[i] = smallestValue;
            System.out.print("\t");
            printArray(a);
        }
    }

    private static void selectionString(String[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if ((a[j].compareTo(a[smallestIndex])) < 0) {
                    smallestIndex = j;
                }
            }
            String temp = a[smallestIndex];
            a[smallestIndex] = a[i];
            a[i] = temp;
            System.out.print("\t");
            printStringArray(a);
        }
    }

    public static void bubbleSort(int[] a) {
        int temp;
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                counter++;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(a);
        }
        System.out.print("counter: " + counter + "\n");
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

    public static int binarySearch(int[] a, int l, int r, int x) {
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
    }

    public static int linearSearch(int[] a, int size, int x) {
        if (size == 0) {
            return -1;
        }
        else if (a[size - 1] == x) {
            return size -1;
        }
        else {
            return linearSearch(a, size -1, x);
        }
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
        int target = IBIO.inputInt("\n\nBinary search for number: ");
        int r = bubble.length - 1, l = 0;
        int result = binarySearch(bubble, l, r, target);
        System.out.println("\nElement " + target + " is present at index " + result);

        int size = linear.length;
        int linearTarget = IBIO.inputInt("\n\nLinear search for number: ");
        int linearResult = linearSearch(linear, size, linearTarget);
        System.out.println("\nElement " + linearTarget + " is present at index " + linearResult);
    }
    public static void stringSorting () {
        String[] original = {"banana", "strawberry", "pineapple", "orange", "apple"};
        String[] selection = cloneString(original);
        String[] bubble  = cloneString(original);

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
    }

    public static void main (String[] args) {
        input();
    }
}
