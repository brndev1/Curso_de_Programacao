package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double total() {
		return n1 + n2 + n3;
	}

	public double missingpoints() {
		if (total() >= 60) {
			return 0;
		} else {
			return 60 - total();
		}
	}

}
