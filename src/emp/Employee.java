package emp;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}



	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}
}
