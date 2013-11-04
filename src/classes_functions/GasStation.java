package classes_functions;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class GasStation {
	int gasPricePerLiter, litersOfGasInStock;
	String name, color;
	public GasStation(String name, String color){
		gasPricePerLiter = 15; litersOfGasInStock = 1000;
		this.name = name;
		this.color = color;
	}
	public int getGasPricePerLiter() {
		return gasPricePerLiter;
	}
	public int getLitersOfGasInStock() {
		return litersOfGasInStock;
	}
	public int refillGas(int amountOfLiters){
		if(amountOfLiters > litersOfGasInStock){
			System.out.println("Your gas request is to big. We only have " + litersOfGasInStock + " liters of gas in stock. But we will give you as much gas as possible");
			int oldLitersOfGasInStock = litersOfGasInStock;
			litersOfGasInStock -= litersOfGasInStock;
			return oldLitersOfGasInStock;
		}
		else{
			litersOfGasInStock -= amountOfLiters;
			return amountOfLiters;
		}
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
}
