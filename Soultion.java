import java.util.HashSet;
import java.util.Set;


public class Soultion {
	public static int findrepeat(int[] numbers){
	Set<Integer> numbersSeen=new HashSet<Integer>();
	for (int number : numbers) {
        if (numbersSeen.contains(number)) {
            return number;
        } else {
            numbersSeen.add(number);
        }
    }
	
	//throw new IllegalArgumentException("no duplicate!");
	return 0;
	
		
	}
	public static void main(String[] args){
		int []a=new int[]{1,2,2,3,4};
		int result=findrepeat(a);
		System.out.print(result);
	}

}
