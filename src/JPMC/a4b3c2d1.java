package JPMC;

public class a4b3c2d1{

	public static void main(String[] args) {
		
		String str = "aaaabbbccd";
		StringBuilder sb = new StringBuilder();
		
		char ch = str.charAt(0);
		int count = 1;
		for(int i = 1; i<str.length(); i++) {
			
			if(ch==str.charAt(i)) {
				count++;
			}
			else {
				sb.append(ch).append(count);
				count = 1;
				ch = str.charAt(i);
			}
		}
		sb.append(ch).append(count);
		
		System.out.println(sb.toString());
		
	}

}
