class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums , 0,new ArrayList<>());
        return ans;
        
}
private void backtrack(int[]nums ,int index,List<Integer> current){
    if (index==nums.length){
        ans.add(new ArrayList<>(current));
        return;
    }

    current.add(nums[index]);
    backtrack(nums , index+1 ,current);

    current.remove(current.size() -1);

    backtrack(nums, index+1, current);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna