package com.stackroute.javape3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveNumberChecker {
    public String checkConsecutiveNumbers(int[] inputArray) {
        String outputMsg="";

        // if numbers are consecutive in ascending manner, store in ascendingList
        List<Integer> ascendingList=new ArrayList<>();
        // if numbers are consecutive in ascending manner, store in ascendingList
        List<Integer> descendingList=new ArrayList<>();

        // check if input has 7 elements
        if(inputArray.length!=7) {
            return "please enter 7 elements only";
        } else {
            for (int loopIndex = 0; loopIndex < inputArray.length - 1; loopIndex++) {
                // store in ascendingList
                if (inputArray[loopIndex] + 1 == inputArray[loopIndex + 1]) {
                    ascendingList.add(inputArray[loopIndex]);
                    // store in descendingList
                } else if (inputArray[loopIndex] - 1 == inputArray[loopIndex + 1]) {
                    descendingList.add(inputArray[loopIndex]);
                } else {
                    // non consecutive numbers
                    outputMsg = Arrays.toString(inputArray ) + " non consecutive numbers";
                    return outputMsg;
                }
            }
            if (inputArray.length == ascendingList.size()+1 || inputArray.length == descendingList.size()+1 ) {
                outputMsg = Arrays.toString(inputArray) + " consecutive numbers";
            } else {
                outputMsg = Arrays.toString(inputArray) + " non consecutive numbers";
            }
        }
        return outputMsg.replaceAll(", ",",");
    }
}
