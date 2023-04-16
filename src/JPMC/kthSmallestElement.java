package JPMC;

import java.util.Arrays;

public class kthSmallestElement {

	public static void main(String[] args) {

		int[] arr = {0,1,0,1,1,1,0,3,2,1,9,7};
		int k = 3;
		
		long count = Arrays.stream(arr).distinct().count();
		if(count<k) {
			return ;
		}else {
			int asInt = Arrays.stream(arr).distinct().skip(k-1).findFirst().getAsInt();
			System.out.println(asInt);
		}
		
	}

}
