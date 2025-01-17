package day5;

public class EnhancedBinarySearch {
										// 0          7         
	public int searchData(int[] arr, int first, int last, int search) {
		
		int mid=(first+last)/2;   //mid=3
		if(search==arr[mid])
			return mid;
		else if(search>=arr[0])
		return binarySearch(arr,first,mid-1,search);
		else
		return binarySearch(arr,mid+1,last,search);	
	}

private int binarySearch(int[] arr, int first, int last, int search) {
	int mid=0;
	while(first<=last)
	{
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
