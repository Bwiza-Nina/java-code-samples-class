package com.classcodes;

import java.io.*;
import java.net.*;

public class UrlConnection {
    public static void main(String [] args) throws IOException {
        try {
            URL url = new URL("http://www.avajava.com/tutorials/lessons/how-do-i-save-an-image-from-a-url-to-a-file.html");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
