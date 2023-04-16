package LeetCode;

import java.util.Arrays;
import java.util.stream.Stream;

public class MedianOfTwoArrays {

	/*
	 * Input: nums1 = [1,2], nums2 = [3,4]
		Output: 2.50000
		Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 */
	public static void main(String[] args) {

		Integer[] arr1 = {1,2};
		Integer[] arr2 = {3,4};
		
		Stream<Integer> stream1 = Arrays.stream(arr1);
		Stream<Integer> stream2 = Arrays.stream(arr2);
		
		Integer[] arrfin = Stream.concat(stream1, stream2).toArray(i->new Integer[i]);
		Arrays.sort(arrfin);
		int len = arrfin.length;
		if(len%2==0) {
			int mid1 = arrfin[len/2];
			float mid2 = arrfin[len/2-1];
			System.out.println("Median : "+(mid1+mid2)/2);
		}else {
			int mid = len/2;
			System.out.println(arrfin[mid]);
		}
		
		
	}

}
