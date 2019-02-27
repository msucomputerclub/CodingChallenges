// Maximum Subarray
// Leetcode Difficulty: Easy
// Date: 02/27/2019

package maximum_subarray;
import java.util.*;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = num[0];
	int totalMax = nums[0];
	for(int i = 1; i < nums.length; i++){
		maxSoFar = Math.max(nums[i], num[i] + maxSoFar);
		totalMax = Math.max(maxSoFar, totalMax);	
	}
    }
}