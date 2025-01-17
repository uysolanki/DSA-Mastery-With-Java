package day5;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int search=77;
		
		int first=0;
		int last=arr.length-1;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			
			if(search==arr[mid])
			{
				System.out.println("FOUND");
				break;
			}
			else if(search>arr[mid])
				first=mid+1;
			else 
				last=mid-1;
		}
		
		if(first>last)
			System.out.println("Not Found");

	}

}
