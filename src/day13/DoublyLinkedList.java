package day13;

public class DoublyLinkedList {

	public static void main(String[] args) {
		Node head=null;
		int arr[]= {10,20,30,40};
		int num=1234;  
		String s1="Apple";
		//head=createFromArray(head,arr);
		//head=createFromInteger(head,num);
		head=createFromString(head,s1);
		System.out.println("Display After Creation");
		display(head);

	}

	private static Node createFromString(Node head, String s1) {
		Node temp=null;
		for(char info:s1.toCharArray())
		{
			Node nn=new Node(info);
			if(head==null)
			{
				temp=nn;
				head=nn;
			}
			else
			{
				temp.next=nn;
				nn.prev=temp;
				temp=temp.next;
			}
			
		}
		
		return head;
	}

//	private static Node createFromInteger(Node head, int num) {
//		String numericString=Integer.toString(num);
//		//"1234"    => ['1' ,'2','3','4']
//		Node temp=null;
//		for(char charInfo:numericString.toCharArray())
//		{
//			int info=(int)charInfo-(int)'0'; //1 <= '1'
//			Node nn=new Node(info);
//			if(head==null)
//			{
//				temp=nn;
//				head=nn;
//			}
//			else
//			{
//				temp.next=nn;
//				nn.prev=temp;
//				temp=temp.next;
//			}
//			
//		}
//		
//		return head;
//	}

	private static void display(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}

//	private static Node createFromArray(Node head, int[] arr) {
//		Node temp=null;
//		for(int info:arr)
//		{
//			Node nn=new Node(info);
//			if(head==null)
//			{
//				temp=nn;
//				head=nn;
//			}
//			else
//			{
//				temp.next=nn;
//				nn.prev=temp;
//				temp=temp.next;
//			}
//			
//		}
//		
//		return head;
//	}
//
	

}
