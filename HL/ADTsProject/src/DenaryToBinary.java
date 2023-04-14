import javax.swing.plaf.synth.SynthTableHeaderUI;

import static java.lang.String.valueOf;

public class DenaryToBinary {
    static int counter = 0;
    public static void int2Bin(int n) {
        Stack binary = new Stack();
        n = Math.abs(n);
        while (n != 0) {
            binary.push(n % 2);
            n = n / 2;
        }
        while (!binary.isEmpty()) {
            int temp = binary.pop();
            System.out.print(bin2String(temp));
        }
    }
    public static String bin2String(int n) {
        return valueOf(n);
    }
    public static void main(String[] args) {
        System.out.print("46 = ");
        int2Bin(46);
        System.out.print(" in binary");
    }
}
