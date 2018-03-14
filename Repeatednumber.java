public class MyClass {
  
  public static void main(String args[]) 
{
   
     int []arr ={1,2,2,3,4};
      
	  int n=0;
       
	  Arrays.sort(arr);
  
          int len=arr.length;
   
	  n=len-1;
        
	 int target=(n^2+n)/2;
    
	 int arraySum=0;
       
	 for(int i=0;i<len;i++){
      
	      arraySum=arraySum+i;
   
         }
        
	System.out.print(arraySum-target);
    
    
    }

}
