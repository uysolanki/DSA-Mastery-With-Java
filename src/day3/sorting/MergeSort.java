package day3.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {9,6,4,5,8,3,7,1};
		System.out.println("Before Merge Sort "+ Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("After Merge Sort "+ Arrays.toString(arr));

	}
                                             //   0          7
	private static void mergeSort(int[] arr, int first, int last) {
		if(first<last)
		{
		int mid=(first+last)/2;             // mid =3
		mergeSort(arr,first,mid);
		mergeSort(arr,mid+1,last);
		merge(arr,first,mid,last);	
		}
	}	
								         //    0          3        7
	private static void merge(int[] arr, int first, int mid, int last) {
		
		int brr[]=new int[last+1];
		int i=first;
		int j=mid+1;
		int k=first;
		
		
		while(i<=mid && j<=last)
		{
			if(arr[i]<=arr[j])
			{
				brr[k++]=arr[i++];
//				i++;
//				k++;
			}
			else
			{
				brr[k++]=arr[j++];
//				j++;
//				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=last)
			{
				brr[k++]=arr[j++];
//				j++;
//				k++;
			}
		}
		
		if(j>last)
		{
			while(i<=mid)
			{
				brr[k++]=arr[i++];
//				i++;
//				k++;
			}
		}
		
		for(int z=first;z<=last;z++)
			arr[z]=brr[z];
		
	}
}
