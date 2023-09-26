import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction enter() {
        String strFraction = IBIO.input("Enter a fraction in a/b format" );
        strFraction = strFraction.replace("/", " ");
        Scanner parse = new Scanner(strFraction);
        int numerator = parse.nextInt();
        int denominator = parse.nextInt();
        Fraction f = new Fraction(numerator, denominator);
        f.simplify(f);
        return f;
    }

    private static int gcd(Fraction a) {
        int x = a.numerator;
        int y = a.denominator;

        do {
            if (x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        while (x != y);
        return y;
    }

    private void simplify(Fraction a) {
        int gcd = gcd(a);
        int n = a.numerator / gcd;
        int d = a.denominator / gcd;
        this.numerator = n;
        this.denominator = d;
    }

    public String toString() {
        String s = numerator + "/" + denominator;
        return s;
    }

    public Fraction add(Fraction b) {
        int num1 = this.numerator;
        int den1 = this.denominator;
        Fraction c = new Fraction(0, 0);

        c.numerator = (num1 * b.denominator) + (b.numerator * den1);
        c.denominator = den1 * b.denominator;
        c.simplify(c);
        return c;
    }
}
