package com.thread;

public class MultiplicatgionTable {
    public synchronized void multiply(int number){
        System.out.println("Multiplication table for " + number);
        try{
            for(int i=1;i<=12;i++){
                System.out.println(i+" * "+number+" = "+(i*number));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
