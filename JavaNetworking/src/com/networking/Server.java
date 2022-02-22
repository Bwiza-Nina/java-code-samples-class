package com.networking;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    private ServerSocket serverSocket;
    public Server(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run(){
        while(true){
            try {
                System.out.println("Waiting for clinet on port "+serverSocket.getLocalPort() + " ");
                Socket server = serverSocket.accept();
                System.out.println("Just  connected to: "+server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getInputStream());
                out.writeUTF("Thank you for connecting to: "+server.getLocalSocketAddress()+"\nGoodbye");
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String [] args) throws IOException{
    }
}
