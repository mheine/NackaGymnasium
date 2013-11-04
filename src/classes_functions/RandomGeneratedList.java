package classes_functions;

import java.util.Random;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class RandomGeneratedList {
	Random rand;
	int maxVal;
	int[] list;
	public RandomGeneratedList(int maxVal){
		this.maxVal = maxVal;
		rand = new Random();
		list = new int[10];
	}
	
	public void generateList(){
		for(int i = 0; i<list.length; i++)
			list[i] = generateRandomNumber();
	}
	
	private int generateRandomNumber(){
		return rand.nextInt(maxVal) +1;
	}
	
	public void printList(){
		for(int i : list)
			System.out.print(i + " ");
	}
	
	public static void main(String[] args){
		RandomGeneratedList rgl = new RandomGeneratedList(10);
		rgl.generateList();
		rgl.printList();
	}
}
