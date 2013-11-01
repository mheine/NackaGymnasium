package classes;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class Vehicle {
	private int weight, wheels;
	private String owner;
	public Vehicle (int weight, int date, String owner){
		this.weight = weight; this.wheels = date; this.owner = owner;
	}
	public int getWeight(){
		return weight;
	}
	public int getWheels(){
		return wheels;
	}
	public String getOwner(){
		return owner;
	}
	public String toString(){
		return "A Vehicle";
	}
}
