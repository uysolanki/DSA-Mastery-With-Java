package day5;

import java.util.Arrays;
import java.util.Scanner;

import day3.sorting.MergeSort;

public class ArraySortRotateSearchDemo {

	public static void main(String[] args) {
		int arr[]= {5,2,9,8,6,1,4,7};
		MergeSort ms=new MergeSort();
		System.out.println("***Merge Sort***");
		System.out.println("Array Before Sorting "+Arrays.toString(arr));
		ms.mergeSort(arr, 0, arr.length-1);
		System.out.println("Array After Sorting "+Arrays.toString(arr));
		
//		BubbleSort bs=new BubbleSort();
//		System.out.println("***Bubble Sort***");
//		System.out.println("Before : "+Arrays.toString(arr));
//		bs.bubbleSort(arr);
//		System.out.println("After : "+Arrays.toString(arr));
		
//		InsertionSort is=new InsertionSort();
//		System.out.println("***Insertion Sort***");
//		System.out.println("Before Sorting : "+Arrays.toString(arr));
//		is.insertionSort(arr);
//		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		int mid= arr.length/2;
		RotateArray ar=new RotateArray();
		ar.rotateArray(arr,mid);
		System.out.println("After Rotation At Mid: "+Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Search");
		int search=sc.nextInt();
		
		EnhancedBinarySearch ehs=new EnhancedBinarySearch();
		int index=ehs.searchData(arr,0,arr.length-1,search);
		System.out.println(index==-1?"Not Found":"Found at Index "+index);
	}
}
