package JPMC;

import java.util.Stack;

public class JPMC6 {

	public static void main(String[] args) {
		
		if(balString("{([])}")) {
			
			System.out.println("Yes it is balanced");
		}else {
			System.out.println("Nope it is not");
		}
	}

	private static boolean balString(String str) {

		
		Stack<Character> st = new Stack<>();
		
		for(int i  = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch=='{' || ch == '[' || ch == '(') {
				st.push(ch);
				continue;
			}
			if(st.isEmpty()) {
				return false;
			}else {
				switch(ch){
				
				case '}' : st.pop();break;
				case ']' : st.pop();break;
				case ')' : st.pop();break;
				
				}
			}
			
		}
		return (st.isEmpty());
		
	}

}
