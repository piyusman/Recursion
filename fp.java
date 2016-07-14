package recursion;

public class fibonacci {
	static long memo[] = new long[60];
	static long fib(int n ){
		if(n==1 || n==0){
			return n;
		}
		
		if(memo[n]!=0){
			return memo[n];
		}
		else{
		memo[n] =  fib(n-1)+ fib(n-2);
		
		return memo[n];
		}
	}
	public static void main(String args[])
	{
		System.out.println(fib(50));
}

}
