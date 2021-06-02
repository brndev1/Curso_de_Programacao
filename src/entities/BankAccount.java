package entities;

public class BankAccount {

	private int number;
	private String name;
	private double deposity;

	public BankAccount() {

	}

	public BankAccount(int number, String name, double deposity) {
		this.number = number;
		this.name = name;
		deposity(deposity);
	}

	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposity() {
		return deposity;
	}

	public void deposity(double deposity) {
		this.deposity += deposity;
	}

	public void whitdraw(double whitdraw) {
		this.deposity -= whitdraw + 5;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", deposity);
	}

}