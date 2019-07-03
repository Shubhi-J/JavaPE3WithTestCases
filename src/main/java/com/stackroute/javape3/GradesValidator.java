package com.stackroute.javape3;

public class GradesValidator {
    public String validateGrades(int noOfStudent,int[] grades) {
        String outputMsg="";
        // if number of grades is more than number of students, give error message
        if(noOfStudent==grades.length) {
        for(int loopIndex=0;loopIndex<grades.length;loopIndex++) {
            // check if all grades are between 0 and 100
            if(grades[loopIndex]>=0 && grades[loopIndex]<=100) {
                outputMsg="the grades are in range";
            } else {
                // if all grades are not between 0 and 100
                outputMsg="the grade should be between 0 and 100";
                return outputMsg;
            }
        }
        } else {
            outputMsg="Number of grades can not exceed the number of students";
        }
        return outputMsg;
    }
}
