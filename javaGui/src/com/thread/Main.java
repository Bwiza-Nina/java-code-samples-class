package com.thread;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Main extends Frame {

    public Main(){
        Label label = new Label("Login in to Apollo");
        label.setBounds(100,0,400,100);
        label.setBackground(Color.white);
        this.add(label);
        this.setTitle("WELCOME TO JAVA GUI");
        this.setBackground(Color.pink);
        this.setBounds(1000, 0, 500, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.out.println("Hello World");
                label.setText("I am about to vanish");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });

    }

    public static void main(String[] args) throws IOException {
	// write your code here
        new Main();
    }
}
