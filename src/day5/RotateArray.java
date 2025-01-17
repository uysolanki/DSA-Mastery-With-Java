package day5;

public class RotateArray {

	public void rotateArray(int[] arr, int mid) {
		for(int i=1;i<=mid;i++)
		{
			int temp=arr[0];
			int j;
			for(j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[j-1]=temp;
		}
		
	}

}
