package com.hello.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class InputOutputDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
		int myChar;
		try {
//		  inputStream=new FileInputStream("C:\\Users\\Cyndy Nina\\Documents\\JS-COURSE\\class a\\myText.txt");
			File file = new File("C:\\Users\\Cyndy Nina\\Documents\\JS-COURSE\\exam\\text.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			outputStream = new FileOutputStream(file);
			inputStream = new FileInputStream(file);
			while((myChar=(inputStream).read())!=-1) {
				  outputStream.write(myChar);
			  }
//		  while((myChar=(inputStream).read())!=-1) {
//			  System.out.print((char)myChar);
//		  }
		}catch(Exception e) {
			System.out.print(e);
		}finally {
			inputStream.close();
			//outputStream.close();
		}
	}
}