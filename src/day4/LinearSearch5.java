package day4;

public class LinearSearch5 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=78;
		int result=linearSearch(arr,n); 
		
		String display=result==-1?"Not Found":"Found at Index "+result;
		System.out.println(display);
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
