package recursion;
import java.util.HashMap;
/*
 * Material for my lectures at Nacka Gymnasium
 * Oscar Alsing
 */
public class Fibonacci {
	static HashMap<Integer, Integer> fibMap;
	public Fibonacci(){
		fibMap = new HashMap<Integer, Integer>();

	}
	public int fib(int i){
		if(i==0)
			return 0;
		else if(i == 1)
			return 1;
		else
			return fib(i-1) + fib(i-2);
	}

	public int memoFib(int i){
		/*
		 * if (i <= 1)
		 * return i;
		 */
		if(i==0)
			return 0;
		if(i==1)
			return 1;
		if(fibMap.containsKey(i))
			return fibMap.get(i);
		
		int val = memoFib(i-1) + memoFib(i-2);
		fibMap.put(i,  val);
		return val;
	}

	public int ackFib(int i){
		return ackFibLoop(i, 0, 1);
	}
	public int ackFibLoop(int i, int a, int b){
		if(i==0)
			return a;
		else
			return ackFibLoop(i-1, b, a+b);
	}

	public static void main(String[] args){
		int fibNumber = 30;
		Fibonacci fib = new Fibonacci();
		long startTime = System.currentTimeMillis();
		System.out.println(fib.fib(fibNumber));
		long stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");

		startTime = System.currentTimeMillis();
		System.out.println(fib.memoFib(fibNumber));
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");

		startTime = System.currentTimeMillis();
		System.out.println(fib.ackFib(fibNumber));
		stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
		
		System.out.println(Integer.MAX_VALUE + " <- Integer Max Value");
	}
}
