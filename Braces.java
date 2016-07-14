package recursion;

public class Braces {

	static void countBrace(int left,int right,char[] str, int count){
		if(left == 0 && right==0){
			System.out.println(str);
		}
		else{
			if(left>0){
				str[count]='(';
				countBrace(left-1,right,str,count+1);
			}
			if(right>left){
				str[count]=')';
				countBrace(left,right-1,str,count+1);
			}
		}
	}
	public static void main(String args[]){
		int num = 5;
		char[] str = new char[num*2];
		countBrace(5,5,str,0);
	}
}
