package com.stackroute.javape3;

public class ThrowException{
    public String Exception(){
        String finalMsg="",ex="";
        try{
        throw new Exception("Exception found");
        } catch (Exception e) {
            ex=e.getMessage();
        }
        finally {
            finalMsg="this message is coming from finally block";
        }
        return ex+"\n"+finalMsg;
    }
}
