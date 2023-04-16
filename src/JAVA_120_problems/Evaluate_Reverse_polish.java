package JAVA_120_problems;

import java.util.Stack;

public class Evaluate_Reverse_polish {

	public static void main(String[] args) {
		/*
		 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 
			["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
		 */
		String[] arr = {"2", "1", "+", "3", "*"};
		
		Stack<String> stack = new Stack<>();
		for(String i : arr) {
			stack.push(i);
		}
		System.out.println(stack);
		for(String i : stack) {
			
			if(i.equals("*") || i.equals("+")) {
				
				String operator = stack.pop();
				String peek1 = stack.peek();
				stack.pop();
				String peek2 = stack.peek();
				Integer val1 = Integer.valueOf((peek1));
				Integer oper = Integer.valueOf(operator);
				Integer val2 = Integer.valueOf(peek2);
				Integer fin = val1(oper)val2;
			}
		}
		
	}

}
