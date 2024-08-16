package top_interview_150;

import java.util.Arrays;

public class MergeSortedArray {

	
	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] nums1 = {1, 2, 3, 0, 0 , 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		sol.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));

	}

}
