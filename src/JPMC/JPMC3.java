package JPMC;

import java.util.Stack;
import java.util.StringTokenizer;

public class JPMC3 {

	public static void main(String[] args) {
		
		String str = "My name is venkat i am from INDIA";
		
		StringTokenizer token = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		Stack<String> st = new Stack<>();
		while(token.hasMoreTokens()) {
			st.push(token.nextToken());
		}
		
		while(!st.isEmpty()) {
			sb.append(st.pop()+" ");
		}
		
		System.out.println(sb.toString());
	}

}
