
public class fibonaccai {
	public static int fibo(int a){
		if(a<=1)
			
			return 1;
		
		System.out.println(fibo(a-1));
		return fibo(a-1)+fibo(a-2);
		
		
	}
	public static void main(String[] args){
	 int n=4;
	 int result =fibo(n);
	 System.out.println("Result "+ result);
	}

}
