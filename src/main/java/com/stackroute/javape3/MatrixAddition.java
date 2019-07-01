package com.stackroute.javape3;

public class MatrixAddition {
    public String addTwoMatrix(int[][] matrix1,int[][] matrix2){
        int noOfRowsMatrix1,noOfRowsMatrix2,noOfColumnMatrix1,noOfColumnsMatrix2;
        String outputMatrix="";
        String matrixA="", matrixB="";
        //count no of rows and columns in each matrix
        noOfRowsMatrix1=matrix1.length;
        noOfRowsMatrix2=matrix2.length;
        noOfColumnMatrix1=matrix1[0].length;
        noOfColumnsMatrix2=matrix2[0].length;

        int[][] sumOfmatrices=new int[noOfRowsMatrix1][noOfColumnMatrix1];
        //check if no of rows and columns are same for both matrices
        if(noOfRowsMatrix1==noOfRowsMatrix2 && noOfColumnMatrix1==noOfColumnsMatrix2) {
            //add matrices
            for(int row=0;row<noOfRowsMatrix1;row++){
                for(int col=0;col<noOfColumnMatrix1;col++){
                    sumOfmatrices[row][col]=matrix1[row][col]+matrix2[row][col];
                    matrixA=matrixA+matrix1[row][col]+" ";
                    matrixB=matrixB+matrix2[row][col]+" ";
                    outputMatrix=outputMatrix+ " " +(sumOfmatrices[row][col]);
                }
                outputMatrix=outputMatrix+"\n";
            }
        } else {
            return "number of rows and columns of both matrix should be same";
        }
        return  "input number of rows of matrix "+noOfRowsMatrix1+
                "\ninput number of columns of matrix "+noOfColumnMatrix1+
                "\ninput elements of first matrix "+matrixA.trim()+
                "\ninput elements of second matrix "+matrixB.trim()+
                "\nsum of the matrices "+outputMatrix.trim();
    }
}
