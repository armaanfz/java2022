public class Mock {
    public static void main(String[] args) {
        System.out.println("My name is Armaan");
        int n = IBIO.inputInt("Input any number: ");
        if (n > 0) {
            IBIO.output("The number was " + n);
        }
        else {
            IBIO.output("Error - enter a positive number");
        }
    }
}
