package composite;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Employee {

	private List<Employee> list = new ArrayList<>();
	private String floor;

	public Floor(String floor) {
		this.floor = floor;
	}

	public void addEmployee(Employee emp) {
		list.add(emp);
	}

	public void removeEmployee(Employee emp) {
		list.remove(emp);
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("------------");
		System.out.println(this.floor);
		for (Employee employee : list) {
			employee.showEmployeeDetails();
		}

	}

}
