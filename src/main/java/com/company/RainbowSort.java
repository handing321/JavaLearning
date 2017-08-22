package com.company;
import java.util.Arrays;
public class RainbowSort {
    public static void rainbowSort(int[] array, int k){

    }
    public static void partition(){

    }
    public static void main(String[] args){

        /*
            Please be notified that a good solution contains:
            1.document your assumptions
            2.explain your approach and how you intend ti solve the problem
            3.provide code comments where applicable
            4.explain the big-O run time complexity of your solution. Justify your answer.
            5.Identifyany additional data strctures you used and justify why you use them.
            6.only provide  your best answer to each part of the question

            Rainbow Sort:

                Given an array of n objects with k different colors (numbered from 1 to k), sort them so that objects
                of the same color are adjacent, with the colors in the order 1, 2, ... k.

                Example:
                Given colors=[3, 2, 2, 1, 4], k=4, your code should sort colors in-place to [1, 2, 2, 3, 4].
                colors=[1,2,3,3,3,1,2,2,3,2,2,1,3,1,1], k=3  out:[1,1,1,1,2,2,2,2,3,3,3,3]

                Solution:
                Rainbow sort solves the same problem in Counting Sort.

                1.Initial count = 0.
                2.Find min and max of the array
                3.Partition all min numbers to the left end of the array and all max numbers to the right end of the array
                4.Repeat Step 1 and Step 2 for middle part and increase k by 2.
                5.Stop until count >= k

            */
        int[] arrayI = {3, 2, 2, 1, 4};

        System.out.println(Arrays.toString(arrayI));
        int[] arrayII = {1, 2, 3, 3, 3, 1, 2, 2, 3, 2, 2, 1, 3, 1, 1};
        System.out.println(Arrays.toString(arrayII));
    }
}