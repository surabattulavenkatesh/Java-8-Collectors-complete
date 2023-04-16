package JPMC;

public class Subsequestchars {

	public static void main(String[] args) {

		String str = "21462675756";
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<arr.length-1; i++) {
			char ch = arr[i];
			char ch2 = arr[i+1];
			int num2 = Integer.valueOf(ch2)-48;
			int num = Integer.valueOf(ch)-48;
			//System.out.println(num);
			if(num%2==0 & num2%2==0) {
				sb.append(arr[i]).append("*");
			}else {
				sb.append(arr[i]).append("_");
			}
		}
		System.out.println(sb.toString());
	}

}
