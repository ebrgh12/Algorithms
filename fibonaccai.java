
public class fibonaccai {
	public static int fibo(int a){
		int febCount =5;
		int[] feb = new int[febCount];
		feb[0]=0;
		feb[1]=1;
		for(int i=2; i<=a;i++){
			feb[i]=feb[i-1]+feb[i-2];
		}
		for(int i=0;i<febCount;i++){
			System.out.print(feb[i] + " ");
		}
		
		return 0;
	}
	public static void main(String[] args){
	 int n=5;
	 fibo(n);
	 //System.out.println("Result "+ result);
	}

}
