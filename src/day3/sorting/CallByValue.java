package day3.sorting;

public class CallByValue {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);		//1. 10
		test(a);
		System.out.println(a);      //4. 10
	}

	private static void test(int b) {
		System.out.println(b);		//2. 10
		b=99;
		System.out.println(b);      //3. 99 
		
	}

}
