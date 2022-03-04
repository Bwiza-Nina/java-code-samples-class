package com.thread;

public class SyncBlockDemo {
    public static void main(String []args) throws Exception{
        Task task = new Task();
        Executor ex1 = new Executor("user", new Task(), 5);
        Executor ex2 = new Executor("user2", task, 6);

        ex1.start();
        ex2.start();

    }
}
