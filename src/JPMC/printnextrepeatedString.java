package JPMC;

public class printnextrepeatedString {

	public static void main(String[] args) {
		
		String str = "HHHIIINNetJJ";
		
		for(int i = 0; i<str.length(); i++) {
			
			int count = 1;
			for(int j = i+1; j<str.length(); j++) {
				
				if(str.charAt(i)!= str.charAt(j)) {
					break;
				}
				count++;
				if(count>2) {
					i++;
				}
				}
				if(count>1) {
					System.out.println(str.charAt(i)+"count : "+count);
				}
				
			}
			
			
		}
	}

