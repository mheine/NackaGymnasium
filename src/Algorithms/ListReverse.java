package Algorithms;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class ListReverse {
	public static int[] reverseList(int[] list){
		int[] al = list;
		int mem;
		for(int i = 0 , j = al.length-1; i<al.length/2; i++, j--){
			mem = al[i];
			al[i] = al[j];
			al[j] = mem;
		}
		return al;
	}
	public static void main(String[] args){
		int[] list = {1,2,3,4,5};
		for(int i : reverseList(list))
			System.out.print(i);
	}

}
