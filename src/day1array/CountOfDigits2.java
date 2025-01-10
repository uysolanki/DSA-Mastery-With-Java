package day1array;

public class CountOfDigits2 {

	public static void main(String[] args) {
		int arr[]= {1234,54,87513,345,1};
		int counter;
		for(int i=0;i<arr.length;i++) 
		{	
			int n=arr[i];															//counter
			counter=0;
			while(n>0)			//n										0
			{					//1234       is 1234>0 True				1
				counter++;		//123		 is 123>0 True				2
				n=n/10;			//12		 is 12>0 True               3
			}					//1			 is 1>0 True				4
		System.out.println("Number " +(i+1) + " has " +counter+ " digits.");
		}						//0

	}

}
