public class Mock {
    public static void main(String[] args) {
        System.out.println("My name is Armaan");
        int n = IBIO.inputInt("Calculate up to term (n) ? ");
        /* if (n > 0) {
            IBIO.output("The number was " + n);
        }
        else {
            IBIO.output("Error - enter a positive number");
        }
        */
        long num1 = 0, num2 = 1;
        int counter = -1;
        float avg2div = 0;
        while (counter < n) {
            avg2div = num1 + avg2div;
            if(n <= 20) {
                IBIO.output(num1 + "; ");
            }
            if(counter == n - 1) {
                break;
            }
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        if(n > 20) {
            IBIO.output(num1);
        }
        float avg = avg2div / n;
        IBIO.output("Average = " + avg);
    }
}
