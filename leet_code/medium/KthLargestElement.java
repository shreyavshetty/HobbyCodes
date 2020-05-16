/**
QuestionLink : https://leetcode.com/problems/kth-largest-element-in-an-array/
Time Complexity ~ O(nlogk) 
Space Complexity = O(k)
**/
import java.util.*;
class Solution {
        
    class Heap {
        int size = 0;
        int capacity = 0;
        int[] heapArray;
        public Heap(int k, int fnum)
        {
            capacity = k;
            heapArray = new int[k];
            heapArray[0] = fnum;
            size++;
        }
        public void heapify(int i)
        {
            int parent = (i-1)/2;
            if(parent<0)
            {
                return;
            }
            
            int left = 2*parent+1;
            int right = 2*parent+2;
            int min = parent;
            if(left<=size)
            {
                min = heapArray[min]>heapArray[left]? left : min;
            }
            if(right<=size)
            {
                min = heapArray[min]>heapArray[right]? right : min;
            }
            if(parent != min)
            {
                int temp = heapArray[min];
                heapArray[min] = heapArray[parent];
                heapArray[parent] = temp;
                heapify(parent);
            }
                
        }
        public void removeAndBuild(int i)
        {
            // System.out.println("size "+size); 
            // System.out.println("i "+i); 
            int left = 2*i+1;
            int right = 2*i+2;
            // System.out.println("left "+left); 
            // System.out.println("right "+right); 
            
            int min = i;
            if(left<size)
            {
               min = heapArray[min]>heapArray[left]? left : min;
            }
            if(right<size)
            {
                min = heapArray[min]>heapArray[right]? right : min;
            }
            if(i!=min)
            {
                int temp = heapArray[min];
                heapArray[min] = heapArray[i];
                heapArray[i] = temp;
                removeAndBuild(min);
            }
            
        }
        public void insert(int n)
        {
            //System.out.println("insert "+n);
            if(size < capacity)
            {
               //System.out.println("size "+size); 
               heapArray[size] = n;
               //System.out.println("Before heapify");
               //display();
               heapify(size);
               size++; 
               //System.out.println("After heapify");
               //display();
               
            }
            else
            {
                //System.out.println("size1 "+size); 
                if(heapArray[0]<n )
                {
                  heapArray[0] = n;
                  //System.out.println("Before heapify");
                  //display();
                  removeAndBuild(0); 
                  //System.out.println("After heapify");
                 //display();
                }
            }
            
        }
        public int minVal()
        {
            return heapArray[0];
        }
        // public void display()
        // {
        //     for(int i=0;i<size;i++)
        //     {
        //         System.out.print(heapArray[i]);
        //     }
        //     System.out.println();
        // }
            
    }
    
    public int findKthLargest(int[] nums, int k) {
        

        Heap hp = new Heap(k, nums[0]);
        // hp.display();
        for(int i=1;i<nums.length;i++)
        {
            
            hp.insert(nums[i]);
            
            //hp.display();
        }
        return hp.minVal();
        
        
    }
}