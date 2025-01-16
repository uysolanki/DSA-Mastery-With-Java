package day4;

public class LinearSearch7 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=50;
		System.out.println(linearSearch(arr,n)==-1?"Not Found":"Found");
	}

	private static int linearSearch(int[] arr, int n) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}	
		return -1;
	}
}
