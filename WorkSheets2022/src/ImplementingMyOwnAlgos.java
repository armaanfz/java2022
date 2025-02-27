public class ImplementingMyOwnAlgos {
    public static void printArray (String[] a) {
        System.out.print("\t");
        for (int i = 0; i < a.length; i++) {
            System.out.printf( "[%d]%-6s  ",i , a[i]);
        }
        System.out.println();
    }
    public static String[] cloneString (String[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static void selectionString (String[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            String temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            printArray(a);
        }
    }

    public static void bubbleUnop(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    String temp = a[j]; // swap the two elements
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                System.out.print("\t>>> j=" + j + " "); printArray(a);
            }
        }
    }

    public static void bubblePartop(String[] a) {
        int sorted = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - sorted -1; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    String temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
                System.out.print("\t>>> j=" + j + " "); printArray(a);
            }
            sorted++;
        }
    }

    public static void bubbleFullop(String[] a) {
        int sorted = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < a.length - sorted -1; i++) {
                if (a[i].compareTo(a[i+1]) > 0) {
                    String temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    swapped = true;
                }
                System.out.print("\t>>> j=" + i + " "); printArray(a);
            }
            sorted++;
        }
    }
    public static void main(String[] args) {
        String[] a = { "Robert", "Boris", "Brad", "George", "David" }; // from our arrays practice #1 - tracing our sorting algos with that example, too
        String[] selection = cloneString(a);
        String[] bubble1 = cloneString(a);
        String[] bubble2 = cloneString(a);
        String[] bubble3 = cloneString(a);

        System.out.println("Original Array:");
        printArray(a);
        System.out.println("\nSelection Sorting:");
        selectionString(selection);
        System.out.println("\nBubble (unoptimized) Sorting:");
        bubbleUnop(bubble1);
        System.out.println("\nBubble (partially optimized) Sorting:");
        bubblePartop(bubble2);
        System.out.println("\nBubble (fully optimized) Sorting:");
        bubbleFullop(bubble3);
    }
}
