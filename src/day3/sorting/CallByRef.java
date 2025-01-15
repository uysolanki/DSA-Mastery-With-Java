package day3.sorting;

public class CallByRef {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println(arr[0]);			//1. 10
		test(arr);
		System.out.println(arr[0]);         //4. 99

	}

	private static void test(int[] brr) {
		System.out.println(brr[0]);			//2. 10
		brr[0]=99;
		System.out.println(brr[0]);         //3. 99
	}

}
