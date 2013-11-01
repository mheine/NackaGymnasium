package classes;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class Car extends Vehicle{
	int maxSpeed;
	public Car(int maxSpeed, int weight, int wheels, String owner){
		super(weight, wheels, owner);
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	@Override
	public String toString(){
		return "A car";
	}
	
	public static void main(String[] args){
		Car car = new Car(100, 1000, 4, "Oscis");
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getOwner());
		System.out.println(car);
	}
}
