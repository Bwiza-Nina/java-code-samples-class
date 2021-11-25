package com.hello.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputOutpuDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Your first name, last name and gender`; ");
		String identification = reader.readLine();
		StringTokenizer tokenizer = new StringTokenizer(identification, ",");
		String firstName = tokenizer.nextToken();
		String lastName = tokenizer.nextToken();
		int age = Integer.parseInt(tokenizer.nextToken());
		System.out.println("My name is"+firstName+" "+lastName+" I am "+age+" years old.");
//		System.out.println("Enter a character");
//		char mychar = (char) reader.read();
//		System.out.println("The read character: "+mychar);
//		System.out.println("Enter any text");
//		String myText = reader.readLine();
//		System.out.println("my text: "+myText);
		}

}
