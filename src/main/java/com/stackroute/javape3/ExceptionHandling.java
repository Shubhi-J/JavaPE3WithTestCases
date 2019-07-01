package com.stackroute.javape3;

public class ExceptionHandling {
    public String handleNegativeArraySizeException(int arrSize) {
        String outputMsg="";
        try{
           // for(int loopIndex=0;loopIndex<arrSize;loopIndex++){
                int[] myArray = new int[arrSize];
                outputMsg="no exception";
            //}
            } catch(NegativeArraySizeException e) {
                outputMsg="negative array size exception";
        }
        return outputMsg;
        }
    public String handleArrayOutOfBoundException(int arrSize) {
        String outputMsg="";
        int[] arr={};
        try{
            for(int loopIndex=0;loopIndex<arrSize;loopIndex++){
                outputMsg="no exception"+arr[5];
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            outputMsg="array index is out of array size";
        }
        return outputMsg;
    }

    public String handleNullPointerException(String input) {
        String outputMsg="";
        int output;
        try{
                output=input.length();
                outputMsg="no exception";
            } catch(NullPointerException e) {
            outputMsg="null pointer exception";
        }
        return outputMsg;
    }
}
