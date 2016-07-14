package recursion;
import java.io.*;

import java.util.*;
public class CountWaysCoins {
			private static int[][] memo;
	   public static int count(int sum,int[] coins , int coin_num){
	       if(sum==0){
	           return 1;
	       } 
	        else if(sum<0){
	            return 0;
	        }
	        else if(coin_num<=0){
	            return 0;
	        }
	        else{
	        	if(memo[sum][coin_num]==-1){
	        		memo[sum][coin_num]=count(sum,coins,coin_num-1)+count(sum-coins[coin_num-1],coins,coin_num);
	        	}
	       return memo[sum][coin_num];
	    }
	   }
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        int sum = scan.nextInt();
	        int coins[] = {1,2};
	        int coin_num=4;
	        memo = new int[sum+1][coin_num+1];
	        for(int i =0;i<=sum;i++){
	        	Arrays.fill(memo[i],-1);
	        }
	        System.out.println(count(sum,coins,coin_num));
	    }
	}


