/**
QuestionLink : https://leetcode.com/problems/course-schedule/
Time Complexity = O(v+e) n- no. of edges
Space Complexity = O(v+e)
**/
class CourseSchedule2{
     boolean dfs(int num, List<List<Integer>> adjList, boolean[] visited, boolean[] rec, List<Integer> order)
    {
        if(visited[num]==true)
        {
            return false;
        }
        visited[num] = true;
        if(adjList.get(num).size()==0 || rec[num]==true)
        {
            if(rec[num] == false)
            {
                rec[num] = true;
                order.add(num);
            }
                            return true;

        }
        for(Integer n: adjList.get(num))
        {
            if(!dfs(n,adjList,visited,rec,order))
            {
                return false;
            }
            visited[n] = false;
        }
        rec[num] = true;
        order.add(num);
        return true;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<Integer> order = new ArrayList<>();
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            List<Integer> arr = adjList.get(prerequisites[i][0]);
            arr.add(prerequisites[i][1]);
        }
        boolean[] rec = new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            boolean[] visited = new boolean[numCourses];
            if(!dfs(i, adjList, visited, rec, order))
            {
                return new int[0];
            }
        }
        int[] res = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            res[i] = order.get(i);
        }
        return res;
        
    }
}