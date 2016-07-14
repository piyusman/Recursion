package recursion;
/*
 * Here we are moving the discs left and right across three towers. if we move left from 1st tower that means we are moving the disc to
 * third tower. Similarly if we are moving a disc right from 3rd tower we are basically moving it to 1st tower.
 */
public class TowerOfHanoi {
public static void moveDiscs(int n, boolean left){
	if(n==0) return;
	moveDiscs(n-1,!left);
	if(left){
		System.out.println("Disc no." + n + " moved left");}
		else{System.out.println("Disc no."+ n + " moved right");}
	
	moveDiscs(n-1,!left);
}

public static void main(String args[])
{
	moveDiscs(3,true);
}
}
