package day7;

import java.util.Collections;
import java.util.PriorityQueue;

public class StonesInTheBag {

	public static void main(String[] args) {
		int arr[] = { 6, 6, 5, 10, 15 }; // ans 2
		PriorityQueue<Integer> stones = new PriorityQueue(Collections.reverseOrder());
		for (int n : arr)
			stones.add(n); // 6 8 5 10 15

		while (stones.size() > 1) // 1>1 false
		{
			int n1 = stones.remove(); // n1=3
			int n2 = stones.remove(); // n2=2 stones = 1

			int diff = n1 - n2; // 1

			if (diff > 0)
				stones.add(diff);
		}

		if (stones.isEmpty())
			System.out.println("No Stones Left");
		else
			System.out.println(stones.remove() + "kg Stone left");

	}

}
