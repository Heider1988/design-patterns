package composite;

public class Developer implements Employee {

	private String name;
	private String occupation;

	public Developer(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", occupation=" + occupation + "]";
	}

}
