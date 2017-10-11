import java.io.*;
import java.util.*;

class Solution {

  static void getShortestUniqueSubstring(char[] arr, String str)
  {
	  Collection value= new ArrayList<>();
	  for(int i=0;i<arr.length;i++){
		  for(int j=0;i<arr.length;i++){
			  for(int k=0;i<arr.length;i++){
				  for(int l=0;i<arr.length;i++){
				  String str1=(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]);
				   value.add(str1);
				  // System.out.println(str1);
			  }
		  }
		}
	  }
	  
	  //Iterator i =value.iterator();
	  for(Object i : value){
		System.out.println(i);  
	  } 
        
  }

  public static void main(String[] args) 
  {
    char []arr ={'x','y','z','a','b','c','d','e'};
    String  str = "xyyzyzyx";
    getShortestUniqueSubstring(arr,str);
  }

}