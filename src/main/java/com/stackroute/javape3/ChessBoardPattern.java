package com.stackroute.javape3;

public class ChessBoardPattern {
    public String drawChessBoardPattern(){
        String outputMatrix="";
        // run two loops, one for rows and one for columns
            for(int row=0;row<8;row++){
                for(int col=0;col<8;col++){
                    // if the sum of row and column is even then print white
                    if((row+col)%2==0) {
                        outputMatrix=outputMatrix+"WW|";
                        // if the sum of row and column is odd then print black
                    } else {
                        outputMatrix=outputMatrix+"BB|";
                    }
                }
                // after completing one row, print new line
                outputMatrix=outputMatrix+"\n";
            }
            return  outputMatrix.trim();
    }
}
