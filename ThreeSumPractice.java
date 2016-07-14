package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumPractice {
	

	ArrayList<ArrayList<Integer>> ThreeSum (ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		Collections.sort(list);
		//System.out.println(list);
		for(int i = 0; i<list.size()-2;i++){
			
			//System.out.println(negate);
			
			
			int start = i+1;
			int end = list.size()-1;
			int negate = -list.get(i);
			while(start<end){
				
				if(list.get(start)+list.get(end) == negate){
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(list.get(i));
					temp.add(list.get(start));
					temp.add(list.get(end));
					all.add(temp);
					set.add(temp);
					start++;
					end--;
					while(start<end && list.get(start)==list.get(start-1)){
						start++;
					}
					while(start<end && list.get(end)==list.get(end+1)){
						end--;
					}
									}
				else if(list.get(start)+list.get(end)<negate){
					start++;
				}
				else{
					end--;
				}
				
			}
			
		}
		
		
		System.out.println(all);
		System.out.println(set);
		return all;
		
		
	}

	ArrayList<ArrayList<Integer>> ThreeSum1 (ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		
		Collections.sort(list);
		System.out.println(list);;
		for(int i =0;i<list.size()-2;i++){
			if(list.get(i)>0){
			
				break;
			}
			for(int j =i+1;j<list.size()-1;j++){
				if(list.get(i)+list.get(j) >0 && list.get(j)>0)
				{
					
					break;
				}
				for(int k = j+1;k<list.size();k++){
					if(list.get(i) + list.get(j)+list.get(k)==0){
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(list.get(i));
						temp.add(list.get(j));
						temp.add(list.get(k));
						all.add(temp);
					//	System.out.println(all);
				
						
					}
					while(1+k<list.size() && list.get(k)== list.get(k+1)){
						System.out.println("k");
						k++;
					}
					while(1+j<list.size() && list.get(j)== list.get(j+1)){
						System.out.println("j");
						j++;
					}
					while(1+i<list.size() && list.get(i)==list.get(i+1) ){
						System.out.println("i loop");
						i++;
					}
					
				}
			}
		}
		//System.out.println(all);
		return all;
	}
	
	
	
	
	
	public static void main(String args[])
	{
		ThreeSumPractice obj = new ThreeSumPractice();
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Hello");
		list.add(-1);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(-2);
		list.add(-1);
		ArrayList<ArrayList<Integer>> all = obj.ThreeSum1(list);
		System.out.println(all);
		all.clear();
		all = obj.ThreeSum(list);
		System.out.println(all);
	}
}
