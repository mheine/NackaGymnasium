package classes_functions;

import java.util.Random;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class RandomGeneratedList {
	Random rand;
	int randomValueLimit;
	int[] list;
	public RandomGeneratedList(int randomValueLimit, int size){
		this.randomValueLimit = randomValueLimit;
		rand = new Random();
		list = new int[size];
	}
	
	public int[] getList(){
		generateList();
		return list;
	}
	public void generateList(){
		for(int i = 0; i<list.length; i++)
			list[i] = generateRandomNumber();
	}
	
	private int generateRandomNumber(){
		return rand.nextInt(randomValueLimit) +1;
	}
	
	public void printList(){
		for(int i : list)
			System.out.print(i + " ");
	}
	
	public static void main(String[] args){
		RandomGeneratedList rgl = new RandomGeneratedList(10, 10);
		rgl.generateList();
		rgl.printList();
	}
}
