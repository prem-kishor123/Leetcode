class Solution{
    public int numSubarraysWithSum(int [] nums, int goal){
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);

        int currSum=0;
        int count=0;

        for(int num : nums){
            currSum+=num;

            if(map.containsKey(currSum - goal)) {
                count+= map.get(currSum - goal);
            }
            map.put(currSum , map.getOrDefault(currSum,0) + 1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna