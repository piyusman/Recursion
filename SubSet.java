package recursion;

import java.util.ArrayList;

public class SubSet {
	
	public static ArrayList<ArrayList<Integer>> getSubSet(ArrayList<Integer> list,int index){
		ArrayList<ArrayList<Integer>> allset; 

		if(list.size() == index){
		allset	= new ArrayList<ArrayList<Integer>>();
			allset.add(new ArrayList<Integer>());
		}
		else{
			allset = getSubSet(list,index+1);
			int item = list.get(index);
			ArrayList<ArrayList<Integer>> more = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> temp : allset){
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(temp);
				newSubset.add(item);
				more.add(newSubset);
			}
			allset.addAll(more);
		}
		return allset;
	}

	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(getSubSet(list,0));
	}
}
