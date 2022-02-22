package com.classcodes;

import java.io.IOException;
import org.jsoup.Jsoup;
import  org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class printImagesFromUrl {
    public static void main(String [] args) throws IOException{
        try {
            Document doc = Jsoup.connect("http://www.javatpoint.com").get();
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            for (Element image : images) {
                System.out.println("src: " + image.attr("src"));
                System.out.println("height: " + image.attr("height"));
                System.out.println("width:" + image.attr("width"));
                System.out.println("alt: " + image.attr("alt"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
