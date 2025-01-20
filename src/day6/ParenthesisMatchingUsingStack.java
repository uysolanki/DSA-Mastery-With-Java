package day6;

import java.util.Stack;

public class ParenthesisMatchingUsingStack {

	public static void main(String[] args) {
		String expression="}()[]{";
		if(expression.length()%2==0)
		{
			boolean result=checkValidness(expression);
			if(result==true)
				System.out.println("Well Formed");
			else
				System.out.println("Not Well Formed");
		}
		else
		{
			System.out.println("Not Well Formed");
		}
		

	}
																				//  stack
	private static boolean checkValidness(String expression) {
		Stack<Character> stack=new Stack();		//	"}[()]}";    				
																				//    
		for(char ch:expression.toCharArray())		//ch=='}'					//    
		{
				if(ch=='{' || ch=='[' || ch=='(' )
				{
					stack.push(ch);
					continue;
				}
				
				if(stack.isEmpty())
					return false;
				
				char z;
				switch(ch)													 //ch=}
				{
				case '}' : z=stack.pop();                               
				           if(z!='{')
				           return false;
				           break;
				           
				case ']' : z=stack.pop();                               
		           			if(z!='[')
		           			return false;
		           			break;
		           			
				case ')' : z=stack.pop();                               //z=}
       						if(z!='(')
       						return false;  			       
				}	
		}
		return(stack.isEmpty());
	}

}
