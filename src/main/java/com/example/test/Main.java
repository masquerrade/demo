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

class CustomSet<T> extends HashSet<T>{

        private int c=0;
        public CustomSet(){
            super();
        }

        @Override
        public boolean add(T t){
            c++;
            return super.add(t);

        }

        public int  getCount(){
            return c;
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

    