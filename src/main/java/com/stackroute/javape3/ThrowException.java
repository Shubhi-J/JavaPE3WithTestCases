package com.stackroute.javape3;

public class ThrowException{
    public String Exception(){
        String finalMsg="",ex="";
        try{
        // if exception is found, throw exception using constructor
        throw new Exception("Exception found");
        } catch (Exception e) {
            ex=e.getMessage();
        }
        finally {
            // Add a message in finally block, which will always be executed
            finalMsg="this message is coming from finally block";
        }
        // return exception message and finally block message
        return ex+"\n"+finalMsg;
    }
}
