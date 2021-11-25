package oop.com;

public class Animal {
	
	public int number;
	private String name;
	private AnimalType animalType;
	
	public Animal(){}
	
	public void produceSound() {
		System.out.println("Generate sound: ");
	}
	public void produceSound(AnimalType type) {
		System.out.println("Sound of: "+type.name());
	}
	public String getAnimalName() {
		return name;
	}
	public void setAnimalName(String name) {
		this.name = name;
	}
	
	public AnimalType getAnimalType() {
		return animalType;
	}
	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
