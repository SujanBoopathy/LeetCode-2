class Solution {
    public void gameOfLife(int[][] board) {
         if (board == null || board.length == 0 ||  board[0] == null ||  board[0].length ==0) {
        	return;
        }
        int m = board.length;
        int n = board[0].length;
        int[][] newBoard = new int[m][n];
        
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
          	    int countNeighbor = count(board, i , j);
                if (board[i][j] == 1) {
                    newBoard[i][j] = (countNeighbor < 2 || countNeighbor > 3) ? 0 : 1;
                } else { // board[i][j] == 0
                    newBoard[i][j] = count(board, i, j) == 3 ? 1 : 0;
                }
          }
        }
        // copy
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
                board[i][j] = newBoard[i][j];        
            }
        }
    }

    int[] dx = {0, 0, 1, -1, -1, -1, 1, 1};
    int[] dy = {1, -1, 0, 0, -1, 1, -1, 1};
    
    // optimize: no need to count all.
    private int count(int[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < dx.length; i++) {
            int mX = x + dx[i];
            int mY = y + dy[i];
            if (mX >= 0 && mX < board.length && mY >= 0 && mY < board[0].length) {
                count += board[mX][mY];
            }
        }
        return count;
    }
}
