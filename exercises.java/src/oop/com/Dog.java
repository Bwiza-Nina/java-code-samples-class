package oop.com;

public class Dog extends Animal{
	
	private int numclaws;
	
	public int getNumclaws() {
		return numclaws;
	}
	public void setNumclaws(int numclaws) {
		this.numclaws = numclaws;
	}
	
	public Dog() {}
	
	public Dog(int numclaws) {
		this.numclaws = numclaws;
	}
	public void produceSound() {
		System.out.println("Barking:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
