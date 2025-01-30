package day13;

public class DoublyCircular {

	public static void main(String[] args) {
		Node head=null;
		int arr[]= {10,20,30,40};
		head=createFromArray(head,arr);
		System.out.println("Display After Creation");
		display(head);

	}

	private static void display(Node head) {
		Node temp=head;
		do
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}while(temp!=head);
		System.out.print(temp.data);
		
		
	}

	private static Node createFromArray(Node head, int[] arr) {
		Node temp=null;
		for(int info:arr)
		{
			Node nn=new Node(info);
			if(head==null)
			{
				temp=head=nn;	
			}
			else
			{
				temp.next=nn;
				nn.prev=temp;
				temp=temp.next;
			}
			nn.next=head;
			head.prev=nn;
		}
		
		return head;
	}

}
