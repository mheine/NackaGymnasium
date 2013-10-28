package recursion;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class MyFirstRecursion {
	public static int multiplyLoop(int loops, int value){
		if(loops <= 1){
			return value;
		}
		else{
			return value * multiplyLoop(loops-1, value);
		}
	}
	
	public static int addLoop(int loops, int value){
		if(loops <= 1){
			return value;
		}
		else{
			return value + addLoop(loops-1, value);
		}
	}
	public static void main(String[] args){
		System.out.println(multiplyLoop(3, 5));
		System.out.println(addLoop(3,3));
	}
}
