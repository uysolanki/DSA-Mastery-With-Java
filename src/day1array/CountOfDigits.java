package day1array;

public class CountOfDigits {

	public static void main(String[] args) {
		long arr[]= {9891123123L,9891767123L,9891128888L,9867543123L,9898769123L};
		int oddcounter,evencounter,r;
		for(int i=0;i<arr.length;i++) 
		{	
			long n=arr[i];													//oddcounter	evencounter   r
			oddcounter=0;
			evencounter=0;
			while(n>0)			//n											0				0             3
			{					//9891123123       is 9891123123>0 True		1		
				r=(int)n%10;	//989112312		   is 989112312>0 True						1			  2
				if(r%2==0)
					evencounter++;
				else
					oddcounter++;
				n=n/10;			//
			}
System.out.print(String.format("Mobile Number %d has %d odd digits and %d even digits",(i+1),oddcounter,evencounter));

		if(oddcounter>evencounter)
			System.out.println(" ODD Biased Number");
		else if(oddcounter<evencounter)
			System.out.println(" EVEN Biased Number");
		else
			System.out.println(" Neutral Number");
		}						//0
	}
}
/*Mobile Number 1 has 7 odd digits and 3 even digits
Mobile Number 2 has 7 odd digits and 3 even digits
Mobile Number 3 has 7 odd digits and 3 even digits
Mobile Number 4 has 7 odd digits and 3 even digits
Mobile Number 5 has 7 odd digits and 3 even digits*/