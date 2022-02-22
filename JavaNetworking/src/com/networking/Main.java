package com.networking;

import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        try{
            Socket socket = new Socket("localhost", 8020);
            OutputStream outToServer = socket.getOutputStream();
            DataOutputStream request = new DataOutputStream(outToServer);
            request.writeUTF("Hello Server");
            InputStream inFromServer = socket.getInputStream();
            DataInputStream response = new DataInputStream(inFromServer);
            System.out.println(response.readUTF());
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
