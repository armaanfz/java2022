public class RealTest {
    public static void main(String[] args) {
        IBIO.output("Armaan Fernandez");
        int n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        while(n < 1 || n > 9) {
            IBIO.out("Error - ");
            n = IBIO.inputInt("Enter an integer between 1 and 9: ");
        }


    }
}
