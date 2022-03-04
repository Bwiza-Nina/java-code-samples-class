package com.thread;

public class Executor extends Thread{
    String name;
    int number;
    Thread t;
    Task task;

    public Executor(String name, Task task, int number){
        this.name = name;
        this.task = task;
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(number + " By " + name + " started");
        synchronized (task) {
            task.perform(number);
        }
    }
    public void start(){
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    }
}
