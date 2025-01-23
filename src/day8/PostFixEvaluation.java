package day8;

import java.util.Stack;

public class PostFixEvaluation {

	public static void main(String[] args) {
		String postfixExpression="58*4/3+2-";
		int result=evaluate(postfixExpression);
		System.out.println(result);

	}

	private static int evaluate(String postfixExpression) {
		Stack<Integer> stack=new Stack();
		for(char ch:postfixExpression.toCharArray())		//'5'
		{
			if(Character.isDigit(ch))
			{
				stack.push(ch - '0');
				continue;
			}
			
			int pop2=stack.pop();
			int pop1=stack.pop();
			
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
