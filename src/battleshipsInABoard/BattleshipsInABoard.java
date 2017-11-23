package battleshipsInABoard;

public class BattleshipsInABoard {

	public static void main(String[] args) {
		countBattleships(new char[][] {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}});
	}
	
    public static int countBattleships(char[][] board) {
        int numberOfShips = 0;
        
        for(int row = 0;row<board.length;row++) {
        	
        	for(int column = 0;column<board[row].length;column++) {
        		
        		if(board[row][column]=='X') {
        			numberOfShips++;
        			board = shipFound(board, row,column);
        		}
        	}
        }
        
        return numberOfShips;
    }
    
    public static char[][] shipFound(char[][] board, int row, int column){
    	
    	board[row][column]='.';
    	if((board.length>row+1)) {
    		if((board[row+1].length>column)) {
    			if(board[row+1][column]=='X') {
    				board = shipFound(board,row+1,column);
    			}
    		}
    	}
    	
    	if((board[row].length>column+1)) {
    		if(board[row][column+1]=='X') {
    			board = shipFound(board,row,column+1);
    		}
    			
    	}
    	
    	return board;
    }
}
