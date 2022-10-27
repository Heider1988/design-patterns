package decorator;

public class ChineeseFood extends FoodDecorator {

	public ChineeseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() 
				+ "Com Arroz Frito e Manchurian  ";
	}

	@Override
	public double foodPrice(double price) {
		return super.foodPrice(price);
	}

}
