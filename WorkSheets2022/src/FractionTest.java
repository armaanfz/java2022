public class FractionTest {
    public static void main(String[] args) {
        Fraction a = Fraction.enter();
        Fraction b = Fraction.enter();
        Fraction c = a.add(b);
        System.out.println(c);
    }
}
