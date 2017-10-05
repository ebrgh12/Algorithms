/* You are given a list of n-1 integers and these integers are in the range of 1 to n. 
  There are no duplicates in list. One of the integers is missing in the list. 
  Write an efficient code to find the missing integer.*/

public class Solution {
	public  static int missing_number(int[]a1){
		int sum=0;
		int n= a1.length+1;//Catch 
		sum=(n*(n+1))/2;
		for(int i=0;i<a1.length;i++){
			sum=sum-a1[i];
		}
		
		return sum; 
	}
	
	public static void main(String[] args){
		int a[]=new int[]{1,2,3,4,6,7,8,9,10};
		int result=missing_number(a);
		System.out.print(result);
	}

}
