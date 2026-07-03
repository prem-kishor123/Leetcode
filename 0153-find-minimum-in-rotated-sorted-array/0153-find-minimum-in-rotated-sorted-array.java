class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        // Current approach: Linear search with O(n) time complexity. 
        // Optimal solution uses binary search for O(log n) time in sorted/rotated case.
        for(int num : nums){
            min = Math.min(min, num);
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna