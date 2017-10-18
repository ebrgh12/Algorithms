
public class LinkedList {
	public static void main(String[] args)
	{
		LinkedListNode a=new LinkedListNode(5);
		LinkedListNode b=new LinkedListNode(1);
		LinkedListNode c= new LinkedListNode(9);
	
		// put b after a
		a.next=b;
		b.previous=a;
		
		//put c after b
		b.next=c;
		c.previous=b;
		
		System.out.println(a.value);
		System.out.println(b.value);
		System.out.println(c.value);
		
	}

}
