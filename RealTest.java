public class RealTest {
    public static void main(String[] args) {
        IBIO.output("Armaan Fernandez");
        int n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        while(n < 1 || n > 9) {
            IBIO.out("Error - ");
            n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        }

        int product;
        for(int i = 1; i <= 20; i++) {
            product = i *  n;
            if (i <= 9) {
                if (product < 10) {
                    IBIO.output(n + " x  " + i + " =   " + product);
                }
                else {
                    IBIO.output(n + " x  " + i + " =  " + product);
                }
            }
            else {
                if (product < 100) {
                    IBIO.output(n + " x " + i + " =  " + product);
                }
                else {
                    IBIO.output(n + " x " + i + " = " + product);
                }
            }
        }
    }
}
