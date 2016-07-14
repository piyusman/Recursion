package recursion;
/*
 * @piyush
 * In this program we need to find that one point is made of another one or not. For example 2,3 so we can move forward i
 * in a way such that (2+3,3) or (2,2+3) which is (5,3) or (2,5)(and it can go on like (2+5,5) is also valid)s  both are valid as they are made up of  (2,3) 
 */
public class TwoPoints {
public static boolean isMatching(int x,int y, int a,int b){
	if(x==a && y==b ){
		return true;
	}
	else if(x>a || y>b){
		return false;
	}
	else{
	boolean first = isMatching(x+y,y,a,b);
	boolean second = isMatching(x,x+y,a,b);
	return first||second;
	}
}

public static void main(String args[]){
	System.out.println(isMatching(2,3,13,11));
}

}
