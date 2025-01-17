package day5;

public class BinarySearchDemo4 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int search=77;
		int index=binarySearch(arr,search);
		System.out.println(index==-1?"Not Found":"Found at Index "+index);
		

	}

	private static int binarySearch(int[] arr, int search) {
		int loopCounter=0;
		int first=0;
		int last=arr.length-1;
		int mid=0;
		while(first<=last)
		{
			loopCounter++;
			mid=(first+last)/2;
			
			if(search==arr[mid])
			{
				break;
			}
			else if(search>arr[mid])
				first=mid+1;
			else 
				last=mid-1;
		}
		
		if(first>last)
			return -1;
		
		return mid;
		
	}

}
