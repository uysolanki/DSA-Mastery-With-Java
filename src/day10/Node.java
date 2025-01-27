package day10;

public class Node {
		
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next=null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}	
}
