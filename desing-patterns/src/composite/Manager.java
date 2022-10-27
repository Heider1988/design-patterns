package composite;

public class Manager implements Employee {

	private String name;
	private String occupation;

	public Manager(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", occupation=" + occupation + "]";
	}

}
