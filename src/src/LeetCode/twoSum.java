package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	//Input: nums = [2,7,11,15], target = 9
	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target = 9;
		int[] arr = twoSum1(nums,target);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] sum(int[] nums, int target) {

		for(int i = 0; i<nums.length; i++) {
			for(int  j =0; j<nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] twoSum1(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
