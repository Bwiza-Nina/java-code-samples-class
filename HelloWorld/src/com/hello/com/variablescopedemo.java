package com.hello.com;
import java.io.IOException;
public class variablescopedemo {

	String message;
	static int status;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String response;
		//instantiation of the class
		variablescopedemo v1 = new variablescopedemo();
		v1.message = "Hello v1";
		variablescopedemo.status = 200;
	    response = "{message: "+ v1.message +" status: "+v1.status+"}";
	    		System.out.println("Response: "+response);
	    		
	    		variablescopedemo v2 = new variablescopedemo();
	    		v2.message = "Hello v2";
	    		variablescopedemo.status = 300;
	    	    response = "{message: "+ v1.message +" status: "+v1.status+"}";
	    		System.out.println("Response: "+response);
	    	
	    		person p1 = new person();
	    		p1.setFirstName("Bwiza");
	    		p1.setLastName("Nina");
	    		p1.setAge(15);
	    		p1.gender = gender.FEMALE;
	    		System.out.println("My name is: "+p1.getFirstName()+" "+p1.getLastName());
	    		
	}

}
