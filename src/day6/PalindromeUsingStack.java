package day6;

import java.util.Stack;

public class PalindromeUsingStack {

	public static void main(String[] args) {
		String str="malayalam";		
		System.out.println(palindrome(str)?"Palindrome String" : "Not Palindrome String");
	}

	private static boolean palindrome(String str) {
		Stack<Character> stack=new Stack();
		for(char ch:str.toCharArray())
			stack.push(ch);
		
		for(char ch:str.toCharArray())
		{
			if(ch!=stack.pop())
			  return false;	
		}
		return true;
	}
}
