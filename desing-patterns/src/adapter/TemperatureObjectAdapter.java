package adapter;

public class TemperatureObjectAdapter {

	private Temperature temp;

	public TemperatureObjectAdapter(Temperature temp) {
		this.temp = temp;
	}

	public void setValueTemp(double value) {
		this.temp.setTemperature(value * 9 / 5 + 32);
	}

	public double getValueCelsius() {
		return (this.temp.getTemperature() - 32) * 5 / 9;
	}

	public double getValueFahrenheit() {
		return this.temp.getTemperature();
	}

}
