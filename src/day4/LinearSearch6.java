package day4;

public class LinearSearch6 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=50;
		int result=linearSearch(arr,n); 
		
		System.out.println(result==-1?"Not Found":"Found at Index "+result);
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
