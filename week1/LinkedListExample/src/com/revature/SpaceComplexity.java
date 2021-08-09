package com.revature;

import java.util.ArrayList;
import java.util.List;

public class SpaceComplexity {

    public static void main(String[] args) {

    }

    public boolean contains(int value, List<Integer> list){

        // Time Complexity: worst case in terms of time the method could take
        // best case: first item is the value
        // worst case: not in the list, we go through n complexity: O(n)

        // Space Complexity: worst case in terms of memory allocation
        // best case: we create 1
        // worst case: we create 1, O(1)


        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(value)){
                return true;
            }
        }

        return false;
    }

    public boolean containsBad(int value, List<Integer> list){

        // has its own stack

        // Time Complexity: worst case in terms of time the method could take
        // best case: the list has one element, O(1)
        // worst case: O(2n) -> O(n)

        // Space Complexity: worst case in terms of memory allocation
        // best case: space complexity of O(n)
        // worst case: space complexity of O(n)

        List<Integer> list2 = new ArrayList<>();

        // populate list2 with values from list O(n)
        for(int i = 0; i < list.size(); i++){
            Integer loc = new Integer(list.get(i));
            list2.add(loc);
        }

        // check if the value exist O(n)
        for(int i = 0; i < list2.size(); i++){
            if(list2.get(i).equals(value)){
                return true;
            }
        }

        return false;
    }

    public void createInteger(){
        Integer int1 = new Integer(1); // in the heap, reference in the stack
    }

    public void createInt(){
        int int1 = 20; // in the stack
    }
}
