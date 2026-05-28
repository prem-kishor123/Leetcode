class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int prev = nums[0];
        a.add(nums[0]);
        int count = 1 ;
        for(int i = 1 ; i < nums.length ; i++){
            if(prev == nums[i] && count<k){
                a.add(nums[i]);
                count++ ;
            }
            else if(prev != nums[i]){
                count = 1 ;
                a.add(nums[i]);
                prev = nums[i];
            }
        }
        int[] ans = new int[a.size()];
        for(int i = 0 ; i < ans.length ;i++){
            ans[i] = a.get(i);
        }
        return ans ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna