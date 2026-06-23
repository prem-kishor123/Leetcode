class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int num : nums){
            
            currentsum +=num;

            maxsum=Math.max(currentsum,maxsum);
            if(currentsum < 0){
                currentsum=0;
            }
        }
return maxsum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna