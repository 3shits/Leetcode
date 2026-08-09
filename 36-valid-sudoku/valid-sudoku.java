class Solution {
    public boolean isValidSudoku(char[][] board) {
        char rows[],cols[],box[];

        for(int i = 0 ;  i < board.length ;i++)
        {
            rows = new char[9];
            cols = new char[9];
            box = new char[9];
            for(int j = 0 ;  j < board[i].length ; j++)
            {
                if(board[i][j] != '.')
                {
                char row = rows[(int)board[i][j]-1 - '0'];
                if(row == '\0')
                rows[(int)board[i][j]-1-'0'] = board[i][j];
                else
                return false;
                }
                
                if(board[j][i] != '.')
                {
                char col = cols[(int)board[j][i]-1-'0'];
                if(col == '\0')
                cols[(int)board[j][i]-1-'0']= board[j][i];
                else
                return false;
                }
            
            char check = board[(j/3)+(3*(i/3))][(j%3)+(3*(i%3))];
            if(check != '.')
            {
                char c = box[(int)check -'0' - 1];
                if(c == '\0')
                box[(int)check -'0' - 1] = check;
                else
                return false;
            }
            }
        }
        return true;
      
    }
}