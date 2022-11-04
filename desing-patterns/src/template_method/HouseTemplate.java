package template_method;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		xpto();
		System.out.println("House is built.");
	}

	public abstract void buildPillars();

	public abstract void buildWalls();

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	private void xpto() {
		System.out.println("XPTO");
	}

}
