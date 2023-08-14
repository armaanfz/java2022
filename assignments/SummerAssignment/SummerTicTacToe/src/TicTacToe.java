/* 
 * Tic Tac Toe prototype class
 * work in progress, code as of 19 May 2020
 *
 * This problem is somewhat related to the magic squares problem, for more information
 * about magic square, check https://en.wikipedia.org/wiki/Magic_square
 *
 */


import java.util.Arrays;

public class TicTacToe
{
	private static boolean play = true;

	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print(" | ");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("--");
				}
			}
			System.out.println();
        }
	}

	public static void printRow(char[][] board, int row)
	{
		if( board == null )
		{
			return;
		}
		row = Math.abs(row);		// |x|; if( row < 0 ) row = row * -1;
		row = row % board.length;	// % modulo;  allows roll over of values
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
	}

	public static void printColumn(char[][] board, int col)
	{
		if( board == null )
		{
			return;
		}
		col = Math.abs(col);
		col = col % board[0].length;
		for(int row = 0; row < board.length; row++)
		{
			System.out.println( board[row][col] );
		}
		System.out.println( );
	}

	public static void printDiagonal1(char[][] board)
	{
		for(int d = 0; d < board.length; d++)
		{	System.out.println( board[d][d] );
		}
	}



	// 0 1 2 3 4 .. n
	// n .. 4 3 2 1 0
	public static void printDiagonal2(char[][] board)
	{
		int size = board.length;
		for(int d = 0; d < size; d++)
		{	System.out.println( board[d][size-1-d] );
		}
	}

	public static boolean isEmpty(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; i < board[i].length; i++) {
				if (board[i][j] != 'O' || board[i][j] != 'X') {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkRow(char[][] board, int row, char player)
	{
		row = Math.abs(row);		// |x|; if( row < 0 ) row = row * -1;
		row = row % board.length;	// % modulo;  allows roll over of values
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			if(board[row][col] != player)
			{	return false;
			}
		}
		return true;
	}

	public static boolean checkColumn(char[][] board, int col, char player) {
		col = Math.abs(col);		// |x|; if( row < 0 ) row = row * -1;
		col = col % board.length;	// % modulo;  allows roll over of values
		for(int row = 0; row < board[col].length; row++) // iterates over each column
		{
			if(board[row][col] != player)
			{	return false;
			}
		}
		return true;
	}

	private static boolean checkDiagonalRL(char[][] board, char player) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] != player) {
				return false;
			}
		}
		return true;
	}
	private static boolean checkDiagonalLR(char[][] board, char player) {
		int j = 0;
		for (int i = board.length-1; i >= 0; i--) {
			if (board[j][i] != player) {
				return false;
			}
			j++;
		}
		return true;
	}

	public static boolean isWin(char[][] board, int row, int column, char player) {
		if (checkRow(board, row, player)) {
			return true;
		} else if (checkColumn(board, column, player)) {
			return true;
		} else if (checkDiagonalLR(board, player)) {
			return true;
		} else if (checkDiagonalRL(board, player)) {
			return true;
		}
		return false;
	}

	public static void playerMove(char[][] board) {
		int min = 0;
		int max = board.length-1;
		int rowX = (int)Math.floor(Math.random() * (max - min + 1) + min);
		int columnX = (int)Math.floor(Math.random() * (max - min + 1) + min);
		int row = IBIO.inputInt("Which row? ");
		int column = IBIO.inputInt("Which column? ");

		while (board[row-1][column-1] != '/') {
			System.out.println("The row and column selected is filled, try again");
			row = IBIO.inputInt("Which row? ");
			column = IBIO.inputInt("Which column? ");
		}

		board[row-1][column-1] = 'O';

		while (board[rowX][columnX] != '/') {
			rowX = (int)Math.floor(Math.random() * (max - min + 1) + min);
			columnX = (int)Math.floor(Math.random() * (max - min + 1) + min);
		}

		board[rowX][columnX] = 'X';

		if (isWin(board, row-1, column-1, 'O')) {
			System.out.println();
			printBoard(board);
			System.out.println("You win!");
			play = false;
		}
		else if (isWin(board, row-1, column-1, 'X')) {
			System.out.println();
			printBoard(board);
			System.out.println("Computer wins!");
			play = false;
		}
		else {
			System.out.println();
			printBoard(board);
		}
	}

	public static void main(String[] args)
	{
		while (play) {
			int n = IBIO.inputInt("How big is the board? ");
			if (n < 3) {
				n = 3;
				System.out.println("Incorrect size, using size of the board as 3");
			}

			char[][] board = new char[n][n];
			// 0 2  1 1  2 0
			for (int i = 0; i < board.length; i++) {
				Arrays.fill(board[i], '/');
			}

			printBoard(board);
			while (isEmpty(board)) {
				playerMove(board);
			}

			if (!isEmpty(board)) {
				System.out.println("It's a tie!");
			}
		}

		char rematch = IBIO.inputChar("Would you like a rematch? Respond with y or n");
		if (rematch == 'y') {
			play = true;
		}
		else {
			System.exit(0);
		}

		/*
		System.out.println();					// 0 4	1 3  2 2  3 1  4 0
		//					   0    1    2    3    4		length=5
		char[][] board2= {	{ '1', '2', '3', '4', '5' },	//  0
							{ '6', '7', '8', '9', 'A' },	//  1
							{ 'B', 'C', 'D', 'E', 'F' },	//  2
							{ 'G', 'H', 'I', 'J', 'K' },	//  3
							{ 'L', 'M', 'N', 'O', 'P' },	//  4
						};

		printBoard(board2);
		System.out.println();

		System.out.println("\nPrinting rows 3 & 9");
		printRow(board2, 3);
		printRow(board2, 9);

		System.out.println("\nPrinting columns 5 & 9");
		printColumn(board2, 5);
		printColumn(board2, 9);

		System.out.println("\nPrinting Diagonal 1");
		printDiagonal1(board);
		System.out.println();
		printDiagonal1(board2);

		System.out.println("\nPrinting Diagonal 2");
		printDiagonal2(board);
		System.out.println();
		printDiagonal2(board2);

		int row = 2;
		System.out.println( "\nChecking player X, row " + (row+1) + "=" + checkRow(board, 2, 'X') ); // checks if player X won row 2 (3rd row)
		*/
	}
}

