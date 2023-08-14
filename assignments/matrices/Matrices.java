/* 
 * Challenge/assignment:	complete the identity, add and subtract methods to perform their
 * 							their respective operations on matrices
 * 
 * http://www.mathsisfun.com/algebra/matrix-introduction.html
 * http://www.purplemath.com/modules/matrices.htm
 * http://www.purplemath.com/modules/mtrxmult.htm
 * https://matrixcalc.org/  to check your results
 * 
 */

import java.util.Scanner;

public class Matrices
{

    // returns the n-by-n identity matrix I
    //public static double[][] identity(int n)
    
	// returns transposed matrix A
    //public static double[][] transpose(double[][] A)

    // returns C = A + B
    //public static double[][] add(double[][] A, double[][] B)

    // returns C = A - B
	//public static double[][] subtract(double[][] A, double[][] B)


    // returns C = A * B
	public static double[][] multiply(double[][] A, double[][] B)
    {
        int rA = A.length;		// number of rows, matrix A
        int cA = A[0].length;	// number of columns, matrix A
        int rB = B.length;		// number of rows, matrix B
        int cB = B[0].length;	// number of columns, matrix B
        double[][] C = new double[rA][cB];
        if (cA != rB)			// B's rows must equal A's columns
        {
            System.out.println("Can't multiply matrices - wrong dimensions.");
        }
        else
        {
			for (int i = 0; i < rA; i++) // process each row of A
			{
				for (int j = 0; j < cB; j++) // process each column of B
				{
					for (int k = 0; k < rB; k++) // process each number on B's column j
					{
						C[i][j] = C[i][j] + ( A[i][k] * B[k][j] );
					}
				}
			}
		}
        return C;
    }

    // print matrix on screen
    public static void printArray(double[][] A)
    {
        int rows = A.length;		// number of rows
        int cols = A[0].length;		// number of columns

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) // output each column
            {
                System.out.printf("%5.2f  ", A[i][j]);
                // alternatively System.out.println( A[i][j] + "  ");
            }
            System.out.println();	// go one line down for next row
        }
    }
    
    public static double[][] create(int m, int n)
    {
		Scanner input = new Scanner(System.in);
		double[][] M = new double[m][n];
		for(int r = 0; r < m; r++)
		{
			for(int c = 0; c < n; c++)
			{
				System.out.print("Enter M(" + r + ", " + c + ") = ");
				double x = input.nextDouble();
				M[r][c] = x;
			}
		}
		return M;
	}

    // test client
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of rows for matrix A: ");
		int rA = input.nextInt();
		System.out.print("Enter Number of columns for matrix A: ");
		int cA = input.nextInt();
		double[][] A = create(rA, cA);
		System.out.println("A =");
		printArray(A);
        System.out.println();
		
		System.out.print("Enter Number of rows for matrix B: ");
		int rB = input.nextInt();
		System.out.print("Enter Number of columns for matrix B: ");
		int cB = input.nextInt();
		double[][] B = create(rB, cB);
		System.out.println("B =");
        printArray(B);
        System.out.println();
        
        System.out.println("A x B =");
        double[][] P = multiply(A, B);
        printArray(P);
/*      
        System.out.println("Add A+B");
        System.out.println("-------");
        double[][] c = add(A, B);
        printArray(c);
        System.out.println();
        
        System.out.println("Identity 5x5");
        System.out.println("--------------------");
        double[][] c = identity(5);
        printArray(c);
        System.out.println();

        System.out.println("A Transposed");
        System.out.println("--------------------");
        double[][] b = transpose(A);
        printArray(b);
        System.out.println();

*/
        System.out.println();
    }
}
