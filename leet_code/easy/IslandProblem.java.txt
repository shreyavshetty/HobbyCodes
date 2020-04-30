/**
QuestionLink : https://leetcode.com/problems/number-of-islands
Time Complexity = O(n*m) n- length of string
Space Complexity = O(n*m)
**/
import java.util.*;
class Solution {
    int[] x = new int[]{0,0,1,-1};
    int[] y = new int[]{-1,1,0,0};
    void dfs(char[][] grid, boolean[][] visited,int m, int n, int i,int j)
    {
        if(i<m && j<n && grid[i][j] == '1' && visited[i][j] == false)
        {
            visited[i][j] = true;
            for(int k=0;k<4;k++)
            {
                if(i+x[k]>=0 && j+y[k]>=0)
                {
                    dfs(grid,visited,m,n,i+x[k],j+y[k]);
                }
            }
        }
       
    }
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        if(m==0)
        {
            return 0;
        }
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1' && visited[i][j] == false)
                {
                    count = count+1;
                    dfs(grid,visited,m,n,i,j);
                }
            }
        }
        return count;
    }
}