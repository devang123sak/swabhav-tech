package com.techlab.game;

public class ResultAnalyzer {
	static Cell cell=new Cell();
	//String[][] cells= new String[3][3];

	public static boolean hasWon(String[][] board, String player) {

		// Check if the player has won by checking winning conditions.
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player || // 1st row
            board[1][0] == player && board[1][1] == player && board[1][2] == player || // 2nd row
            board[2][0] == player && board[2][1] == player && board[2][2] == player || // 3rd row
            board[0][0] == player && board[1][0] == player && board[2][0] == player || // 1st col.
            board[0][1] == player && board[1][1] == player && board[2][1] == player || // 2nd col.
            board[0][2] == player && board[1][2] == player && board[2][2] == player || // 3rd col.
            board[0][0] == player && board[1][1] == player && board[2][2] == player || // Diagonal           
            board[2][0] == player && board[1][1] == player && board[0][2] == player) //   Diagonal      
        {
        	System.out.println("*******win "+player+"'s  Player...*******");
        	System.exit(0);
        	return true;
        	
        }
        else {

            return false;
        }

	}
	
	public static boolean drawGame(String[][] board)
	{
		if(cell.findEmptyCell(board)==0)
		{
			System.out.println("Game is draw");
			System.exit(0);
			return true;
		}
		 return false;
	}
		
	
}
