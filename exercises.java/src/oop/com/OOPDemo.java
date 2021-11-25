package oop.com;

public class OOPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal= new Animal();
		animal.produceSound();
		animal.produceSound(AnimalType.OMNIVOROUS);
					
		//class casting
		Animal dog = new Dog();
//		Dog specialDog= new Dog();
				
		Dog specialDog= (Dog)dog;
				
		dog.produceSound();
		dog.produceSound(AnimalType.CARNIVOROUS);
		specialDog.setNumclaws(4);
	}

}
