package classes_functions;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class Car extends Vehicle{
	int maxSpeed, tankSize, currentAmountOfGas;
	public Car(int maxSpeed, int weight, int wheels, String owner, int tankSize){
		super(weight, wheels, owner);
		this.maxSpeed = maxSpeed; this.tankSize = tankSize; this.currentAmountOfGas=tankSize;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	@Override
	public String toString(){
		return "A car owned by " + owner + " with a weight of " + weight + "kg and " + wheels + " wheels!";
	}
	
	/*
	 * We assume that we can store an arbitrary amount of gas.
	 */
	public void tankCar(GasStation gs, int amountOfLiters){
		// refillGas returns the amount of gas that could be provided
		System.out.println("Refilling gas at the " + gs.getColor() + " gas station named \"" + gs.getName() + "\"");
		currentAmountOfGas += gs.refillGas(amountOfLiters);
		System.out.println("Our current amount of gas is " + currentAmountOfGas + "liters");
	}
	
	public String calculateDistanceTraveled(int speed, int seconds){
		double distance = (speed/3.6)*seconds;
		return "Distance traveled in " + seconds + " seconds at " + speed/3.6 + " meters per second is: " + distance;
	}
	
	public static void main(String[] args){
		Car car = new Car(100, 1000, 4, "Oscis", 1500); /* That's one huge tank */
		GasStation gs = new GasStation("Go back to LoL noob", "yellow");
		System.out.println(car);
		System.out.println(car.calculateDistanceTraveled(car.getMaxSpeed(), 15));
		car.tankCar(gs, 100);
	}
}
