package day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CurrencyExchange3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of currency denominations");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		
		System.out.println("Enter the " + size + " Currency denominations in random order");
		for(int i=0;i<size;i++)
		{
			currency[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the exchange amount");
		int exchangeAmount=sc.nextInt();
		
		
		exchange(currency,exchangeAmount);

	}

	
	private static void exchange(int[] currency, int exchangeAmount) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int n:currency)
			pq.add(n);
		
		int noteCount=0;
		while(exchangeAmount>0)							//exchangeAmount					curr  notes   nc
		{												//5655				is5655>0 T		500   11      0
		    int curr=pq.remove();						//155								200	  0		  11
			int notes=exchangeAmount/curr;				//155
			exchangeAmount=exchangeAmount%curr;
			noteCount+=notes;	
			
			if(notes!=0)
			System.out.println(String.format("%d X %d", notes,curr));
		}
	
		System.out.println("Total Notes " +noteCount );
	}

}
