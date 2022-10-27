package composite;

public class AppCompany {

	public static void main(String[] args) {

		Floor floor1 = new Floor("floor1");
		Floor floor2 = new Floor("floor2");
		Floor floor3 = new Floor("floor3");

		Employee dev1 = new Developer("Heider", "Dev Java");
		Employee dev2 = new Developer("Ana", "Dev C#");
		Employee m1 = new Manager("Paulo", "Manager");

		floor1.addEmployee(dev1);
		floor1.addEmployee(dev2);
		floor1.addEmployee(m1);

		floor1.addEmployee(floor2);

		Employee dev3 = new Developer("Marcelo", "Dev JavaScript");
		Employee m2 = new Manager("Alexandre", "Manager");

		floor2.addEmployee(dev3);
		floor2.addEmployee(m2);

		floor2.addEmployee(floor3);

		Manager m3 = new Manager("Jaqueline", "Manager");
		Developer dev4 = new Developer("Sandro", "Dev Java");
		Developer dev5 = new Developer("Maria", "Dev Cobol");
		Developer dev6 = new Developer("Paula", "Dev C++");
		Manager m4 = new Manager("Manuel", "Manager");

		floor3.addEmployee(m3);
		floor3.addEmployee(dev4);
		floor3.addEmployee(dev5);
		floor3.addEmployee(dev6);
		floor3.addEmployee(m4);

		floor1.showEmployeeDetails();

	}

}
