package day4;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,50,40,70,20};
		int n=90;
		int flag=0;   //0 1     boolean true false
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				flag=1;
				System.out.println("Found");
				break;
			}
		}
		if(flag==0)
			System.out.println("NOT Found");

	}

}
