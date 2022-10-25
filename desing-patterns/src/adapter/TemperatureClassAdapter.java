package adapter;

public class TemperatureClassAdapter extends Temperature {

	@Override
	public void setTemperature(double temperature) {
		super.setTemperature(temperature * 9 / 5 + 32);
	}

	@Override
	public double getTemperature() {
		return (super.getTemperature() - 32) * 5 / 9;
	}

	public double getValueInFahrenheit() {
		return super.getTemperature();
	}

}
