package day1array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumbers2 {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList(Arrays.asList(10,20,40,100,150));
		int sum=270;
		int flag=0;
		for(int i=0;i<arr.size();i++)
		{
			int num1=arr.get(i);   //num1=10
			int num2=sum-num1;     //num2=160
					if(arr.contains(num2))
					{
					System.out.println("["+num1+","+num2+"]");
					flag=1;
					break;
					}
		}
		if(flag==0)
		{
			System.out.println("NO PAIR FOUND");
		}
	}
}


//T(n)=O(n)  -Linear Time Complexity

//T(n)=O(n square)  - Quadractic Time Complexity

//O(n square) > O(n)