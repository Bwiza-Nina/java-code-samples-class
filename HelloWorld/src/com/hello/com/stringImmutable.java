package com.hello.com;
import java.io.IOException;

public class stringImmutable {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str = "dog";
		String str2 = new String("dog");
		System.out.println("The word is: "+str);
		str.concat("cat");
		System.out.println("str: "+str);
		String str1 = str.concat(" and cats are lovely pets");
		System.out.println("The combined string is: "+str1);
		
		if(str.equals(str2)) {
			System.out.println("Str and str2 contain the same value");
		}
	}
}
