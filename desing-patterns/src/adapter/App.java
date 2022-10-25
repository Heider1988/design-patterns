package adapter;

public class App {

	public static void main(String[] args) {

//		Temperature t = new Temperature();
//		t.setTemperature(40);
//		System.out.println(t.getTemperature());

//		TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//		adapter.setTemperature(27);
//		System.out.println(adapter.getTemperature());
//		System.out.println(adapter.getValueInFahrenheit());

		TemperatureObjectAdapter obj = new TemperatureObjectAdapter(new Temperature());
		obj.setValueTemp(26);
		System.out.println(obj.getValueCelsius());
		System.out.println(obj.getValueFahrenheit());

	}

}
