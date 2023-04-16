package JPMC;

public class firstRepchar {

	public static void main(String[] args) {
		
		String str = "amskk";
		
		for(int i = 0; i<str.length(); i++) {
			
			boolean unique = false;
			for(int j = 0; j<str.length(); j++) {
				
				if(i!=j &&  str.charAt(i) == str.charAt(j)) {
					unique = true;
					break;
				}
			}
			if(unique) {
				System.out.println("First Repeated  character : "+str.charAt(i));
				break;
			}
		}
	}

}
