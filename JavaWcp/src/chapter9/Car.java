package chapter9;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int dir) {
		System.out.println(dir + "km走ります");
		this.fuelAmount -= (dir / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}

}
