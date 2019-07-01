package com.stackroute.javape3;

public class ChessBoardPattern {
    public String drawChessBoardPattern(){
        String outputMatrix="";
            for(int row=0;row<8;row++){
                for(int col=0;col<8;col++){
                    if((row+col)%2==0) {
                        outputMatrix=outputMatrix+"WW|";
                    } else {
                        outputMatrix=outputMatrix+"BB|";
                    }
                }
                outputMatrix=outputMatrix+"\n";
            }
            return  outputMatrix.trim();
    }
}
