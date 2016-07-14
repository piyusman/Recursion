package recursion;

public class factorial {
public static int doFactorial(int n){
	if(n==1) return 1;
	return n*doFactorial(n-1);
}

public static void main(String args[]){
	int a =doFactorial(3);
	System.out.println(a);
}
}
