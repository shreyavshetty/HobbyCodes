/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    List<Integer> flatList;
    int fsize;
    int curr;
    List<NestedInteger> nestedList;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList  = nestedList;
       flatList = new ArrayList<Integer>();
       int size = nestedList.size();
       
       for(int i=0;i<size;i++)
       {
           if(nestedList.get(i).isInteger())
           {
               flatList.add(nestedList.get(i).getInteger());
           }
           else
           {
               
               getIntegerUtil(nestedList.get(i).getList());
           }
       }
        
        
       fsize = flatList.size();
       //   for(int i=0;i<fsize;i++)
       // {
       //       System.out.println(flatList.get(i));
       //   }
        curr = 0;
    }

    public void getIntegerUtil(List<NestedInteger> l)
    {
        for(int i=0;i<l.size();i++)
       {
           if(l.get(i).isInteger())
           {
               flatList.add(l.get(i).getInteger());
               
           }
           else
           {
               getIntegerUtil(l.get(i).getList());
           }
       }
    
    }
    @Override
    public Integer next() {
        
      int n = flatList.get(curr);
      curr++;
        return n;
    }

    @Override
    public boolean hasNext() {
        
        if(curr>=fsize)
        {
            return false;
        }
        return true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */