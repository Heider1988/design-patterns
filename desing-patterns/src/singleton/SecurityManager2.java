package singleton;

public class SecurityManager2 {

	private static SecurityManager2 instance;

	static {
		try {
			instance = new SecurityManager2();
		} catch (Exception e) {
		}
	}

	private SecurityManager2() {
	}

	public static SecurityManager2 getInstance() {
		return instance;
	}

	public void login() {

	}
}
