package decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() 
			+ "Com Frango Assado e molho Barbecue  ";
	}

	@Override
	public double foodPrice(double price) {
		return super.foodPrice(price);
	}

}
