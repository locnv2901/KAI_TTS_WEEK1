package com.lamdangfixbug.ex5;

import com.lamdangfixbug.utils.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        getArrayAndPrintItLongestIncreasingSubsequence();
    }

    public static int[] longestIncreasingSubsequence(int[] a) {
        int[] longestSub = {};
        for(int i = 0 ; i < a.length; i++){
            int[] subsequence = increasingSubsequence(a,i);
            if(subsequence.length > longestSub.length){
                longestSub = subsequence;
            }
        }
        return longestSub;
    }

    static int[] increasingSubsequence(int[] a, int start) {
        List<Integer> subsequence = new ArrayList<>();
        subsequence.add(a[start]);
        int last = a[start];
        for(int i = start+1; i < a.length; i++) {
            if(a[i] > last) {
                subsequence.add(a[i]);
                last = a[i];
            }
        }
        if(subsequence.size() > 1) {
            return subsequence.stream().mapToInt(i -> i).toArray();
        }
        return new int[0];
    }

    public static void getArrayAndPrintItLongestIncreasingSubsequence() {
        Integer numOfElement = null;
        while (numOfElement == null || numOfElement < 0) {
            try{
                numOfElement = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter array length: "));
                if(numOfElement < 0) {
                    System.out.println("Array length must be greater than or equal to zero");
                }
            }catch (Exception e){
                System.out.println("Invalid input");
            }
        }
        int[] arr = new int[numOfElement];
        for(int i = 0 ; i < numOfElement; i++){
            Integer num = null;
            while (num == null) {
                try{
                    num = Integer.parseInt(Utils.repeatInputWhenInvalid("Enter arr[" + i + "]: "));
                    }catch (Exception e){
                    System.out.println("Invalid input");
                }
            }
            arr[i] = num;
        }
        System.out.println(Arrays.toString(longestIncreasingSubsequence(arr)));
    }
}
