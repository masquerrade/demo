package com.example.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      
      //First thing I need to do is using the prerequisites array create an adjacency matrix which will be a list of list.Index will represent the vertex and the list will represent all the courses for which the current index is the prerequsite.
      
      //Iterate through the prerequisite list and for each prerquusite assign the courses that is add the edge.
      
      List<List<Integer>> lst=new ArrayList<>();
      
      //First I need to initialise all the List
      
      int n=prerequisite.size();
      int [] indegree=new int[n];
      
      for(int i=0;i<n;i++){
        lst.add(i,new ArrayList<>());
      }
      
      //Here my lst is created
      for(int [] l:lst){
        lst.get(l[1]).append(l[0]);
        indegree[l[0]]++;
      }
      
      //Now I need to add to the queue the courses for which there are no prereq
      
      //For each course I need to maintain how many prereq are remaining.I need this for topological sorting
      
      
      
    }
}


public class Main{


    public static void main(String [] args) {
            Main m1 =new Main();
            CustomSet<Integer> s=new CustomSet<>();
            insertObject(s);
            System.out.println(s.getCount());
        
   
    }

    

     public static void insertObject(Set<Integer> set){
        set.add(100);
        set.add(300);
        set.add(200);
        set.add(100);
        set.add(100);
        set.add(300);
        set.add(400);
     }
 


}

    