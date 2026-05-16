import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> check = new HashSet<>();
        // HashSet<Character> row = new HashSet<>();
        // HashSet<Character> col = new HashSet<>();
        // HashMap<Integer,Character> sq = new HashSet<>();
        for(int i = 0;  i < board.length ; i++)
        {
            check.clear();
            for(int j = 0; j < board[i].length ; j++)
            {
                if(check.contains(board[i][j]))
                return false;
                else
                {
                    if(board[i][j] != '.')
                    check.add(board[i][j]);
                }
            }
        }
        
        check.clear();
        for(int i = 0;  i < board.length ; i++)
        {
            check.clear();
            for(int j = 0; j < board[i].length ; j++)
            {
                if(check.contains(board[j][i]))
                return false;
                else
                {
                    if(board[j][i] != '.')
                check.add(board[j][i]);
                }
            }
        }
        
        check.clear();
        for(int i = 0 ; i < 3 ; i++)
        {
            
            for(int j = 0 ; j < 3 ; j++)
            {
                
                check.clear();
                for(int x = i*3 ; x < (i+1)*3 ; x++)
                {
                    for(int y = j*3 ;  y < (j+1)*3; y++)
                    {
                        if(check.contains(board[x][y]))
                        return false;
                        else
                        {
                            if(board[x][y] != '.')
                            check.add(board[x][y]);
                        }
                    }
                }
            }
        }
        
        return true;

    }
}