package day4;

public class LinearSearch4 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=70;
		int result=linearSearch(arr,n); 
		if(result==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at Index "+result);
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
