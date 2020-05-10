/**
QuestionLink : https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
Time Complexity = O(n*m) 
Space Complexity = O(n*m)
**/
class Solution {
    int[] x = {0,0,-1,1};
    int[] y = {1,-1,0,0};
   
    public int dfs(int[][] matrix, int i, int j, int [][] visited)
    {
        //System.out.println(i+" "+j);

        int max = 0;
        boolean pathFound = false;
        for(int k=0;k<4;k++)
        {
            int nx = i+x[k];
            int ny = j+y[k];
            if(nx>=0 && ny>=0 && nx<matrix.length && ny<matrix[0].length && matrix[nx][ny]>matrix[i][j])
            {
                //System.out.println(nx+" "+ny);
                if(visited[nx][ny] == 0)
                {
                    max = Math.max(max, dfs(matrix, nx, ny , visited));
                }
                else
                {
                    max = visited[nx][ny];
                }
                
                pathFound = true;
                if(max>=visited[i][j])
                {
                    visited[i][j] = max+1;
                    
                }
                 
                //System.out.println(max);
                
            }
            
        }
        if(pathFound == false)
        {
            visited[i][j]=1;
        }
        return  visited[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        if(matrix == null || matrix.length==0 || matrix[0] == null || matrix[0].length==0)
        {
            return 0;
        }
        int [][] visited = new int[matrix.length][matrix[0].length];
        int maxval = 0;
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //System.out.println("cc "+i+" "+j);
                maxval =  Math.max(maxval, dfs(matrix, i, j , visited));
            }
        }
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
        return maxval;
        
    }
}