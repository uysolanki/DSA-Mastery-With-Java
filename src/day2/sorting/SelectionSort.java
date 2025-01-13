package day2.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {6,7,2,5,3};
		System.out.println("***Selection Sort***");
		System.out.println("Before : "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After : "+Arrays.toString(arr));
	}

	private static void selectionSort(int[] brr) {
		int temp;
		for(int i=0;i<brr.length;i++) //01234
		{
		    for(int j=i+1;j<brr.length;j++) //1234,234,34,4
		      {
		    		if(brr[i]>brr[j])
		    		{
		    			temp=brr[i];
		    			brr[i]=brr[j];
		    			brr[j]=temp;
		    		}
		      }
		}
		
	}

}
