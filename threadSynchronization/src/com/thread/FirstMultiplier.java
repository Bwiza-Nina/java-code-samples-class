package com.thread;

public class FirstMultiplier extends Thread{
    String name;
    Thread t;
    int number;
    MultiplicatgionTable table;

    public FirstMultiplier(String name, int number, MultiplicatgionTable table){
        this.name = name;
        this.number = number;
        this.table = table;
    }
    @Override
    public void run(){
        table.multiply(number);
    }
    public void start(){
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    }
}
