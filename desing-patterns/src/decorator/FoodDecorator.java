package decorator;

public abstract class FoodDecorator implements Food {

	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice(double price) {
		return newFood.foodPrice(price);
	}

}
