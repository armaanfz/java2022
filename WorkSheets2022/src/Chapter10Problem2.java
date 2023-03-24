/*
Write a program that will read in a sequence of 0’s and 1’s
as a binary number and change the input form from binary
to decimal. Remember that what is being read in are characters
and not numbers. Your program must test if only 0's and 1's
are in the input. Otherwise output error message.
 */

import java.util.Arrays;

public class Chapter10Problem2
{
    static boolean isBinary(String binary)
    {
        char[] binArray = binary.toCharArray();
        for (int i = 0; i < binArray.length; i++)
        {
            if (binArray[i] != '0' && binArray[i] != '1')
                return false;
        }
        return true;
    }

    static int power(int base, int exp)
    {
        if (exp == 0)
            return 1;
        int power = 1;
        for (int i = 0; i < exp; i++)
        {
            power = power * base;
        }
        return power;
    }

    static int bin2int(String binary)
    {
        char[] binArray = binary.toCharArray();
        int[] binValues = new int[binArray.length]; // or binary.length()
        int[] powersOf2 = new int[binArray.length]; // or binary.length()
        // first we build an array with the powers of 2, for the positional
        // notation approach
        for (int i = 0; i < binArray.length; i++)
        {
            powersOf2[binArray.length-1-i] = power(2, i);
        }
        // second, we convert the char array into an int array (binValues)
        for(int i = 0; i < binArray.length; i++)
        {
            if (binArray[i] == '1')
                binValues[i] = 1;
            else if(binArray[i] == '0')
                binValues[i] = 0;
        }
        System.out.println(Arrays.toString(powersOf2));
        System.out.println(Arrays.toString(binValues));
        int total = 0;
        for(int i = 0; i < binValues.length; i++)
        {
            total = total + (binValues[i] * powersOf2[i]);
        }
        return total;
    }

    public static void main(String[] args)
    {
        //System.out.println(power(2,8)); //testing
        //System.out.println(bin2int("1010")); //testing
        String binary = IBIO.input("Enter a binary number: ");
        if (!isBinary(binary))
        {
            System.out.println("Error - input is not a binary number");
        } else
        {
            System.out.println(bin2int(binary));
        }
    }

}
