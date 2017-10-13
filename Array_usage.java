package Array_usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//The following are top 10 methods for Java Array. They are the most voted questions from stackoverflow.
public class Array_usage {
	public static void main(String[] args){
		
		//Declare an array
		String[] aArray= new String[5];
		String[] bArray= {"a","b","c","d","e"};
		String[] cArray = new String[]{"a","b","c","d","e"};
		
		// Printing an array in Java
		int[] intArray={1,2,3,4,5};
		String intArrayString =Arrays.toString(intArray);
		//Printing directly will print reference value
		System.out.println(intArray); //some object memory will be printed
		System.out.println(intArrayString); //[1,2,3,4,5]
		
		//Create an ArrayList from an array
		String[] stringArray ={"a","b","c","d","e"};
		ArrayList <String> arrayList =new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList); //[a,b,c,d,e]

		//Check if an array contains a certain value
		String[] stringArray1={"a","b","c","d","e"};
		boolean b= Arrays.asList(stringArray1).contains("a");
		System.out.println(b); // true
		
		//Concatenate two Arrays
		int[] intArray1 ={1,2,3,4,5};
		int[] intArray2={6,7,8,9,10};
	//	int[] combinedIntArray= ArrayUtils.addAll(intArray1,intArray2);
		
		//Declarean array inline
	//	method(new String[]{"a","b","c","d","e"});
		
		//Convert an ArrayList to an array
		String[] stringArray2={"a","b","c","d","e"};
		ArrayList<String> arrayList2 =new ArrayList<String>(Arrays.asList(stringArray));
		String[] stringArr =new String[arrayList2.size()];
		arrayList.toArray(stringArr);
		for(String s: stringArr)
			System.out.println(s);
	
	// Convert an array to a set
		Set<String> set =new HashSet<String>(Arrays.asList(stringArray));
		System.out.println(set);
		
	//Reverse an array
		int[] intArray3={1,2,3,4,5};
	//	ArrayUtils.reverse(intArray3);
		
		// Remove element of an array
		int[] intArray4= {1,2,3,4};
		//int[] removed = ArrayUtils.removeElement(intArray,3);
		//System.out.println(Arrays.toString(removed));
		
		
		
	}

}
