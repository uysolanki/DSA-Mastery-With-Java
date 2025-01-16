package day4;

public class LinearSearch2 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=20;
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Found");
				break;
			}
		}
		if(i==arr.length)
			System.out.println("NOT Found");
	}
}
