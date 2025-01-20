package day6;

public class CricketTeam {

	public static void main(String[] args) {
		int arr[]= {4, 3, 5, 3};
		int k=3;
		int maxTeams=calculateMaxTeams(arr,k);
		System.out.println(maxTeams==-1?"No Teams Possible" :"Maximum teams Possible "+ maxTeams);
	}

	private static int calculateMaxTeams(int[] arr, int k) {
		
		int min=0;   
		int max=10;  
		
		while(min<=max)	  //is 0<=10  true   					
		{
			int mid=(min+max)/2;	  //mid=5				
			
			if(midTeamsPossible(arr,mid,k))  //true
			{
				if(!midTeamsPossible(arr,mid+1,k))
				{
					return mid;
				}
				else
				{
					min=mid+1;
				}
			}
			else
			{
				max=mid-1;
			}
		}
		return -1;
	}															//{4, 3, 5, 3};
																//6						3
	private static boolean midTeamsPossible(int[] arr, int possibleNumberOfTeams, int playersPerTeam) {
		int totalPlayersNeeded=possibleNumberOfTeams*playersPerTeam;   //18
		
		int sum=0;
		for(int n:arr)
		sum=sum+Math.min(n, possibleNumberOfTeams);  //sum =0,4,7,12,15
		
		if(sum>=totalPlayersNeeded)
			return true;
		else 
			return false;
		
	}

}
