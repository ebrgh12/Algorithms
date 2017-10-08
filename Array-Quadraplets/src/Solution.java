import java.io.*;
import java.util.*;

class Solution {
  
  static void findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        for(int k=0;k<arr.length;k++){
          for(int l=0;l<arr.length;l++){
           // System.out.print(arr[i]);
            //System.out.print(arr[j]);
            //System.out.print(arr[k]);
            //System.out.println(arr[l]);
           int sum=arr[i]+arr[j]+arr[k]+arr[l];
           if(sum==s){
        	   System.out.println(arr[i]+" "+arr[j]+" "+ arr[k]+ " "+ arr[l]);
           }
          }
        }     
      }
    }
  }

  public static void main(String[] args) {
int[] a= new int[]{2, 7, 4, 0, 9, 5, 1, 3}; 
    int s=20;
      findArrayQuadruplet(a,s);
  }

}