package com.hello.com;

public class StringCompilation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuilder str1 = new StringBuilder("x");
		for(int i =0; i<1000000; i++) {
			str1.append(" Bwiza");
		}
		long timeDifference = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed time is: "+timeDifference);
	
	
	
	startTime = System.currentTimeMillis();
	StringBuffer str2 = new StringBuffer("x");
	for(int i =0; i<1000000; i++) {
		str2.append(" Bwiza");
	}
 timeDifference = System.currentTimeMillis() - startTime;
	System.out.println("Elapsed time is: "+timeDifference);
}


}
