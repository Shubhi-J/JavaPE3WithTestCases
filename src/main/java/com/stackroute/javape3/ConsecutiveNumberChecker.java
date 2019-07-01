package com.stackroute.javape3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveNumberChecker {
    public String checkConsecutiveNumbers(int[] inputArray) {
        String outputMsg="";
        List<Integer> ascendingArray=new ArrayList<>();
        List<Integer> descendingArray=new ArrayList<>();

        if(inputArray.length!=7) {
            return "please enter 7 elements only";
        } else {
            for (int loopIndex = 0; loopIndex < inputArray.length - 1; loopIndex++) {
                if (inputArray[loopIndex] + 1 == inputArray[loopIndex + 1]) {
                    ascendingArray.add(inputArray[loopIndex]);
                } else if (inputArray[loopIndex] - 1 == inputArray[loopIndex + 1]) {
                    descendingArray.add(inputArray[loopIndex]);
                } else {
                    outputMsg = Arrays.toString(inputArray ) + " non consecutive numbers";
                    return outputMsg;
                }
            }
            if (inputArray.length == ascendingArray.size()+1 || inputArray.length == descendingArray.size()+1 ) {
                outputMsg = Arrays.toString(inputArray) + " consecutive numbers";
            } else {
                outputMsg = Arrays.toString(inputArray) + " non consecutive numbers";
            }
        }
        return outputMsg.replaceAll(", ",",");
    }
}
