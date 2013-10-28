package recursion;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class ListSum {
	static int[] list = {1,2,3,4,5,6,7,8,9,10};
	public ListSum(){
	}
	
	public static int forEachLoopListSum(){
		int sum = 0;
		for(int i : list)
			sum+=i;
		return sum;
	}
	
	public static int forLoopListSum(){
		int sum = 0;
		for(int i = 0; i<list.length; i++)
			sum+=list[i];
		return sum;
	}
	
	public static int recursionSum(){
		return listRecursion(list.length-1);
	}
	
	public static int listRecursion(int i){
		if(i<0)
			return 0;
		else
			return list[i] + listRecursion(i-1);
	}
	
	public static void main(String[] args){
		System.out.println(forEachLoopListSum());
		System.out.println(forLoopListSum());
		System.out.println(recursionSum());
	}
}
