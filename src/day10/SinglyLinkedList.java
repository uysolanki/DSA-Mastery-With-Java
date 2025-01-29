package day10;

import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String[] args) {
//		Node head=null;
//		Scanner sc=new Scanner(System.in);
//		head=create(head);
//		System.out.println("Display After Creation");
//		display(head);
	
		
		Node head1=null;
		Node head2=null;
		Node head3=null;
		head1=create(head1);
		head2=create(head2);
		
		head3=merge(head1,head2);
		ascendingSort(head3);
		System.out.println("Display After MergeList");
		display(head3);
		head3=union(head3);
		System.out.println("Display After Union");
		display(head3);
		
		
//		head=reverseList(head);
//		System.out.println("Display After Reverse");
//		display(head);
		
//		ascendingSort(head);
//		System.out.println("Display After Ascending Sorting");
//		display(head);
//		descendingSort(head);
//		System.out.println("Display After Descending Sorting");
//		display(head);
		
		
//		head=addFirst(head);
//		System.out.println("Display After Adding At First Position");
//		display(head);
//		
//		addLast(head);
//		System.out.println("Display After Adding At Last Position");
//		display(head);
//		
//		System.out.println("Enter the position of new node");
//		int aposition=sc.nextInt();
//		addMid(head,aposition);
//		System.out.println("Display After Adding At " + aposition +" Position");
//		display(head);
//		
//		head=deleteFirst(head);
//		System.out.println("Display After Deleting At First Position");
//		display(head);
//		
//		deleteLast(head);
//		System.out.println("Display After Deleting At Last Position");
//		display(head);
//		
//		System.out.println("Enter the position of new node");
//		int dposition=sc.nextInt();
//		deleteMid(head,dposition);
//		System.out.println("Display After Deleting from " + dposition +" Position");
//		display(head);
//		
//		System.out.println("Enter the Number to Search");
//		int search=sc.nextInt();
//		int position=searchList(head,search);
//		System.out.println(position==-1?"Not Found ":"Found");
		
		
	}

	private static Node union(Node head3) {
		Node temp=head3;
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			
			temp=temp.next;
		}
		return head3;
	}

	private static Node merge(Node head1, Node head2) {
		Node temp=head1;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head2;
		return head1;
	}

	private static Node reverseList(Node head) {
		Node left=null;
		Node current=head;
		Node right=null;
		
		while(current!=null)
		{
			right=current.next;
			current.next=left;
			left=current;
			current=right;
		}
		return left;
	}

	private static void ascendingSort(Node head) {
		Node i;
		Node j;
		int temp;
		for(i=head;i!=null;i=i.next) //01234
		{
		    for(j=i.next;j!=null;j=j.next) //1234,234,34,4
		      {
		    		if(i.data>j.data)
		    		{
		    			temp=i.data;
		    			i.data=j.data;
		    			j.data=temp;
		    		}
		      }
		}
		
	}
	
	private static void descendingSort(Node head) {
		Node i;
		Node j;
		int temp;
		for(i=head;i!=null;i=i.next) //01234
		{
		    for(j=i.next;j!=null;j=j.next) //1234,234,34,4
		      {
		    		if(i.data<j.data)
		    		{
		    			temp=i.data;
		    			i.data=j.data;
		    			j.data=temp;
		    		}
		      }
		}
		
	}

	private static int searchList(Node head, int search) {
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==search)
			{
				return 1;
			}
			temp=temp.next;
		}
		return -1;
	}

	private static void deleteMid(Node head, int dposition) {
		Node temp=head;
		int i=1;
		while(i<dposition-1)
		{
		temp=temp.next;
		i++;
		}
		
		temp.next=temp.next.next;
	}
	
	private static void deleteLast(Node head) {
		Node temp=head;
		while(temp.next.next!=null)
			temp=temp.next;
		temp.next=null;
	}

	private static Node deleteFirst(Node head) {
		head=head.next;
		return head;
	}

	private static void addMid(Node head, int position) {
		Node temp=head;
		int i=1;
		while(i<position-1)  //3<3
		{
			temp=temp.next;
			i++;
		}
		
		Node nn=getNode();
		nn.next=temp.next;
		temp.next=nn;
	}

	private static void addLast(Node head) {
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		
		Node nn=getNode();
		temp.next=nn;
	}

	private static Node addFirst(Node head) {
		Node nn=getNode();
		nn.next=head;
		head=nn;
		return head;
	}

	private static Node getNode() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data for Node");
		int info=sc.nextInt();
		Node newNode=new Node(info);
		return newNode;
	}

	private static void display(Node head) {
		Node temp=head;
		while(temp!=null) //null!=null ? True
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("NULL\n");
	}
	//10->20->30->NULL
	private static Node create(Node head) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of LL");
		int size=sc.nextInt();
		Node temp=null;
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter Data for Node " + i + " : ");
			int info=sc.nextInt();
			Node nn=new Node(info);
			if(head==null)
			{
				head=nn;
				temp=nn;
			}
			else
			{
				temp.next=nn;
				temp=temp.next;
			}
		}
		return head;
	}

}
