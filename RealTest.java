public class RealTest {
    public static void main(String[] args) {
        IBIO.output("Armaan Fernandez");
        int n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        while(n < 1 || n > 9) {
            IBIO.out("Error - ");
            n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        }

        int product;
        while(n != 0) {
            for(int j = 1; j <= n; j++) {
                for(int i = 1; i <= 20; i++) {
                    product = j * i;
                    if (i == 20) {
                        if (product < 100) {
                            IBIO.output(j + " x " + i + " =  " + product);
                        }
                        else {
                            IBIO.output(j + " x " + i + " = " + product);
                        }
                        IBIO.output("------------");
                    }
                    else {
                        if (i <= 9) {
                            if (product < 10) {
                                IBIO.output(j + " x  " + i + " =   " + product);
                            }
                            else {
                                IBIO.output(j + " x  " + i + " =  " + product);
                            }
                        }
                        else {
                            if (product < 100) {
                                IBIO.output(j + " x " + i + " =  " + product);
                            }
                            else {
                                IBIO.output(j + " x " + i + " = " + product);
                            }
                        }
                    }
                }
            }
            n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        }
    }
}
