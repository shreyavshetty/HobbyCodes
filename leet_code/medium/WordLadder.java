class Solution {
    public ArrayList<Integer> transformList(List<String> wordList, String str)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int k=0;k<wordList.size();k++)
        {
            int count = 0;
            for(int i=0;i<wordList.get(k).length();i++)
            {
                if(wordList.get(k).charAt(i) == str.charAt(i))
                {
                    count++;
                }
            }
            if(count == wordList.get(k).length()-1)
            {
                list.add(k+1);
            }
        }
        return list;
        
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(wordList==null || wordList.size()==0 || !wordList.contains(endWord))
        {
            return 0;
        }
        int endIndex = wordList.indexOf(endWord)+1;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> startList = transformList(wordList, beginWord);
        if(startList.size() == 0)
        {
            return 0;
        }
        adjList.add(startList);
        for(String word : wordList)
        {
            adjList.add(transformList(wordList, word));
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        boolean[] visited = new boolean[wordList.size()+1];
        int level = 0;
        while(!queue.isEmpty())
        {
            level++;
            int size = queue.size();
            while(size>0)
            {
                int idx = queue.poll();
                if(idx == endIndex)
                {
                    return level;
                }
                if(visited[idx] == false)
                {
                    
                    visited[idx] = true;
                    ArrayList<Integer> list = adjList.get(idx);
                    for(Integer i : list)
                    {
                        if(!visited[i])
                        {
                            queue.add(i);
                        }
                    }
                }
                size--;
            }
            
        }
        return 0;
    
    }
}