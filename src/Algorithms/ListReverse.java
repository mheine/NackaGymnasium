package Algorithms;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class ListReverse {
	public static void reverseList(int[] list){
		int mem;
		/*
		 * Why would happen if we replaced
		 * i<list.length/2
		 * with
		 * i<list.length?
		 */
		for(int i = 0 , j = list.length-1; i<list.length/2; i++, j--){
			mem = list[i];
			list[i] = list[j];
			list[j] = mem;
		}
	}
	
	//bubble sort
	public static void sortList(int[] list){
		for(int i = 0; i<list.length; i++){
			for(int j = 1; j<list.length; j++){
				if(list[j-1] > list[j]){
					int temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}	
			}
		}
	}
	public static void main(String[] args){
		int[] list = {1,2,3,4,5};
		reverseList(list);
		for(int i : list)
			System.out.print(i + " ");
		System.out.println();
		
		int[] newList = {1,4,2,3,2,1};
		sortList(newList);
		for(int i : newList)
			System.out.print(i + " ");
	}

}
