package recursion;

import java.util.ArrayList;

public class Permutations {
	
	static  ArrayList<String> makePermutations(String s){
		ArrayList<String> perm = new ArrayList<String>();
		if(s== null)
		{
			return null;
		}
		else if (s.length()==0){
			perm.add("");
			return perm;
			
		}
		else{
		char first = s.charAt(0);
		String rem = s.substring(1);
		ArrayList<String> words = makePermutations(rem);
		for(String word : words){
			for(int i=0;i<=word.length();i++){
				perm.add(makeString(word,first,i));
				
			}
		}
		}
		return perm;
	}

			static String makeString(String word, char first,int i){
				String start = word.substring(0,i);
				String end = word.substring(i);
				return start + first + end;
			}
			
			
			public static void main(String args[]){
				ArrayList<String> perm = makePermutations("abc");
				System.out.println(perm);
			}
}
