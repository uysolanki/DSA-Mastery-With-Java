package day8;

import java.util.Stack;

public class PreFixEvaluation {

	public static void main(String[] args) {
		String prefixExpression="-+/*58432";
		int result=evaluate(prefixExpression);
		System.out.println(result);

	}

	private static int evaluate(String prefixExpression) {
		Stack<Integer> stack=new Stack();
		//for(char ch:prefixExpression.toCharArray())		//
		for (int i = prefixExpression.length() - 1; i >= 0; i--)
		{
			char ch=prefixExpression.charAt(i);
			if(Character.isDigit(ch))
			{
				stack.push(ch - '0');
				continue;
			}
			
			int pop1=stack.pop();
			int pop2=stack.pop();
			
			switch(ch)
			{
			case '+' : stack.push(pop1+pop2);break;
			case '-' : stack.push(pop1-pop2);break;
			case '*' : stack.push(pop1*pop2);break;
			case '/' : stack.push(pop1/pop2);break;
			}
			
		}	
		return stack.pop();
	}

}
