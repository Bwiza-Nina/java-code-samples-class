package com.classcodes;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadImageFromUrl {
    public static void main(String [] args) throws IOException{
        BufferedImage image = null;
        try{
            URL url = new URL("https://images.unsplash.com/photo-1643813069855-7c9d8b6a8e66?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80");
            image = ImageIO.read(url);

            System.out.println(image);

            ImageIO.write(image, "png", new File("C:\\Users\\ninam\\Pictures\\Saved Pictures\\image.png"));
            ImageIO.write(image, "jpg", new File("C:\\Users\\ninam\\Pictures\\Saved Pictures\\image.jpg"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
