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
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + "; ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
