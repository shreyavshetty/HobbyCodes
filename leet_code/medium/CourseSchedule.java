/**
QuestionLink : https://leetcode.com/problems/course-schedule/
Time Complexity = O(v+e) n- no. of edges
Space Complexity = O(v+e)
**/
import java.util.*
class CourseSchedule{
    boolean dfs(int num, Map<Integer,List<Integer>> adjList, boolean[] visited, boolean[] rec)
    {
        if(visited[num]==true)
        {
            return false;
        }
        visited[num] = true;
        if(adjList.get(num).size()==0 || rec[num]==true)
        {
            return true;
        }
        for(Integer n: adjList.get(num))
        {
            if(!dfs(n,adjList,visited,rec))
            {
                return false;
            }
            visited[n] = false;
        }
        rec[num] = true;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer,List<Integer>> adjList = new HashMap<>();
        for(int i=0;i<numCourses;i++)
        {
            adjList.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            List<Integer> arr = adjList.get(prerequisites[i][0]);
            arr.add(prerequisites[i][1]);
        }
        boolean[] rec = new boolean[numCourses];
        for(Map.Entry<Integer,List<Integer>> entry : adjList.entrySet())
        {
            int num = entry.getKey();
            boolean[] visited = new boolean[numCourses];
            if(!dfs(num, adjList, visited, rec))
            {
                return false;
            }
        }
        return true;
        
    }
}

