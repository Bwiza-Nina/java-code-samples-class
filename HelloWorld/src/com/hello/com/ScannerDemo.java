package com.hello.com;
import java.io.IOException;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
				int age = scan.nextInt();
				System.out.println("Enter your height");
				Double height = scan.nextDouble();
				System.out.println("Enter your names");
				String names = scan.nextLine();
				System.out.println("names: "+names);
				System.out.println("age: "+age);
				System.out.println("height: "+height);
	}

}
