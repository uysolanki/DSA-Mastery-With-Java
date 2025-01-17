package day4;

import java.util.Scanner;

public class ShopKeeperTargets {

	public static void main(String[] args) {
		          //day1    2    3    4    5   6    7
		          //  100  600  1000 1700 1900 2400 3000
		int arr[] = { 100, 500, 400, 700, 200, 500, 600 };
		int numberOfTargets = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= numberOfTargets; i++) 
		{
			System.out.println("Enter Target Number " + i + ": "); // target
			int target = sc.nextInt(); // 2000
			int flag=0;
			int sum = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				sum = sum + arr[j];
				if (sum >= target) 
				{
					System.out.println("Target Achived on Day " + (j+1));
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Sorry Target Not Achieved");
		}
	}
}
