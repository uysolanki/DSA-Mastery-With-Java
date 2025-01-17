package day2.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {6,7,2,5,3};
		System.out.println("***Bubble Sort***");
		System.out.println("Before : "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After : "+Arrays.toString(arr));
	}
	public static void bubbleSort(int[] brr) {
		int temp;
		for(int i=1;i<brr.length;i++) //01234
		{
		    for(int j=0;j<brr.length-i;j++) //1234,234,34,4
		      {
		    		if(brr[j]>brr[j+1])
		    		{
		    			temp=brr[j];
		    			brr[j]=brr[j+1];
		    			brr[j+1]=temp;
		    		}
		      }
		}
		
	}

}
