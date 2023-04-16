package Java8to18;
import java.util.Stack;

public class AdvancedSwitch {

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
			if(st.isEmpty()) 
			{
				return false;
			}else {
				switch(ch) {case '}',')',']'-> st.pop();}
			}
			
		}
		return (st.isEmpty());
		
	}

}
