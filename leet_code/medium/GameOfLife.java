class Solution {
    public void gameOfLife(int[][] board) {
        
        int n = board.length;
        int m = board[0].length;
        int[] x = {1,-1,0,0,-1,1,-1,1};
        int[] y = {0,0,1,-1,-1,1,1,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int count = 0;
                for(int k=0;k<8;k++)
                {
                    if((i+x[k]>=0 && j+y[k]>=0 && i+x[k]<n && j+y[k]<m) && (board[i+x[k]][j+y[k]] == 1 || board[i+x[k]][j+y[k]] == -1))
                    {
                        count++;
                    }
                }
                //System.out.println("i j count"+i+" "+j+" "+count);
                if(board[i][j] == 1 || board[i][j] == -1)
                {
                    if(count<2)
                    {
                        board[i][j] = -1;
                    }
                    else if(count>3)
                    {
                        board[i][j] = -1;
                    }
                }
                else
                {
                    if(count == 3)
                    {
                        board[i][j] = 2;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] == -1)
                {
                    board[i][j] = 0;
                }
                else if(board[i][j] == 2)
                {
                    board[i][j] = 1;
                }
            }
        }
        
    }
}