package strategy;

public class App {

	private static final String CREDIT = "credit";
	private static final String DEBIT = "debit";
	private static final String CASH = "cash";

	public static void main(String[] args) {

		Bill bill = new Bill();

		bill.addLineItem(new LineItem("Milk", 200));
		bill.addLineItem(new LineItem("Bread", 150));

		bill.pay(PaymentMethodFactory.getPaymentMethod(CREDIT));

	}

}
