package day7;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		int arr[]= {6, 8, 5, 10, 15};
		PriorityQueue<Integer> stones=new PriorityQueue(Collections.reverseOrder());
		for(int n:arr)
			stones.add(n);     //6 8 5 10 15
		
		if(stones.size()>1)    //size=5
		{
			int n1= stones.remove();
			int n2= stones.remove();
			System.out.println("Difference between the 2 heaviest Stones is : " +(n1-n2));
		}
		else
		{
			System.out.println("Please enter minimum 2 stones");
		}

	}

}
