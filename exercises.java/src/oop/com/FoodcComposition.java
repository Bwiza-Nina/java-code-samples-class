package oop.com;

public class FoodcComposition {

	private String mainFood;
	private String ingredients;
	private Animal owner;
	
	
	
	public String getMainFood() {
		return mainFood;
	}



	public void setMainFood(String mainFood) {
		this.mainFood = mainFood;
	}



	public String getIngredients() {
		return ingredients;
	}



	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}



	public Animal getOwner() {
		return owner;
	}



	public void setOwner(Animal owner) {
		this.owner = owner;
	}


	public FoodComposition() {}
	
	public FoodComposition(String mainFood, String ingredient, Animal owner) {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
