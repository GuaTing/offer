package 面试题10;


public class Fibonacci {
	//实用解法
	public long fibonacci(int n){
		long result =0;
		long first = 1;
		long second = 0;
		if( n == 0){
			return second;
		}
		if(n == 1){
			return first;
		}
		for(int i = 2;i<= n ;i++){
			result = first+second;
			second = first;
			first = result;
		}
		return result;
	}
	public static void main(String[] args){
		Fibonacci fabonacci = new Fibonacci();
		System.out.println(fabonacci.fibonacci(8));
	}


}
