package Algorithms;

import classes_functions.RandomGeneratedList;

/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class ListSum {
	public ListSum(){}
	
	public static int calculateSumOfEvenNumbers(int elementLimit){
		int sum = 0;
		for(int i = 1; i<=elementLimit; i++)
			if(i%2 == 0)
				sum+=i;
		return sum;
	}
	public static int calculateSumOfRandomNumbers(int randomValueLimit, int size){
		//Generate a list of random numbers with a higher limit.
		RandomGeneratedList rgl = new RandomGeneratedList(randomValueLimit, size);
		int[] list = rgl.getList();
		int sum = 0;
		for(int i : list){
			System.out.print(i + " ");
			sum+=i;
		}
		System.out.println();
		return sum;
	}
	public static void main(String[] args){
		System.out.println(calculateSumOfEvenNumbers(100));
		System.out.println(calculateSumOfRandomNumbers(100, 10));
	}
}
