package day1array;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList();
		numbers.add(99);
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
		
		System.out.println(numbers.get(0));
		
		System.out.println(numbers.contains(20));  //true
//		System.out.println(numbers.size());  //3
//		numbers.remove(1);
//		System.out.println(numbers.size());  //2
//		
//		numbers.clear();
//		System.out.println(numbers.size());  //0
		
//		ArrayList<String> names=new ArrayList();
//		names.add("Alice");
//		names.add("Ben");
//		names.add("Chris");
//		
//		System.out.println(names);
//		names.remove(2);
//		System.out.println(names);
	}

}
