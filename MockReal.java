public class MockReal {
    public static void main(String[] args) {
        IBIO.output("Armaan Fernandez");
        int n = IBIO.inputInt("Enter a number: ");

        for (int i = 1; i <= n; i++) {
            IBIO.out(i + " ");
            int square = i * i;
            IBIO.out(square + " ");

            int power = 1;
            for (int j = 1; j <= i; j++) {
                power = n * power;
            }
            IBIO.output(power);
        }
    }
}
