package com.stackroute.javape3;

public class ExceptionHandling {
    // for negative array size exception
    public String handleNegativeArraySizeException(int arrSize) {
        String outputMsg="";
        try{
           // if array size is not negative, no excetion
                int[] myArray = new int[arrSize];
                outputMsg="no exception";
            // if array size is negative, no excetion
            } catch(NegativeArraySizeException e) {
                outputMsg="negative array size exception";
        }
        return outputMsg;
        }

    // for array out of bound exception
    public String handleArrayOutOfBoundException(int arrSize) {
        String outputMsg="";
        int[] arr={};
        try{
            // if fetch an element in array range
            for(int loopIndex=0;loopIndex<arrSize;loopIndex++){
                outputMsg="no exception"+arr[5];
            }
            // if fetch an element out of array range
        } catch(ArrayIndexOutOfBoundsException e) {
            outputMsg="array index is out of array size";
        }
        return outputMsg;
    }

    // for null pointer exception
    public String handleNullPointerException(String input) {
        String outputMsg="";
        int output;
        try{
            // if input is not null
                output=input.length();
                outputMsg="no exception";
            // if input is null, handle exception
        } catch(NullPointerException e) {
            outputMsg="null pointer exception";
        }
        return outputMsg;
    }
}
