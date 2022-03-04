package com.thread;

public class Task {
    void perform(int number){
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
