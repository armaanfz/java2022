import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void enter() {
        String strFraction = IBIO.input("Enter a fraction in a/b format" );
        strFraction = strFraction.replace("/", " ");
        Scanner parse = new Scanner(strFraction);
        numerator = parse.nextInt();
        denominator = parse.nextInt();
        //this.simplify();
    }

    private static int gcd() {
        return 0;
    }

    private void simiplify() {

    }
    public String toString() {
        String s = numerator + "/" + denominator;
        return s;
    }

    public Fraction add(Fraction b) {
        int num1 = this.numerator;
        int den1 = this.denominator;
        Fraction c = new Fraction();

        c.numerator = (num1 * b.denominator) + (b.numerator * den1);
        c.denominator = den1 * b.denominator;
        return c;
    }
}
