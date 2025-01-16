//from an array display the perfect squares
package day4;

public class DisplayPerfectSquaresFromArray {

	public static void main(String[] args) {
		int arr[]= {25,9,13,16,21};
		
		for(int n:arr)								//n				sq			sq*sq      output
		{											//25			5           25          25
			int sq=(int)Math.sqrt(n);				//9             3           9           9
													//13 			3           9           -    
			if(sq*sq==n)							//16            4           16          16
				System.out.println(n);              //21            4           16          -
		}
	}

}

