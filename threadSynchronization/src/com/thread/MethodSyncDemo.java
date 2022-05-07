package com.thread;

import java.io.IOException;

public class MethodSyncDemo {
    public static void main(String []args) throws IOException{
        MultiplicatgionTable table = new MultiplicatgionTable();
        FirstMultiplier first = new FirstMultiplier("firstMultiplier", 3, table);
        SecondMultiplier second = new SecondMultiplier("secondMultipier", 9, table);

        first.start();
        second.start();
    }
}
