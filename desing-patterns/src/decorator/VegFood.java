package decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice(double price) {
		return price;
	}

}
