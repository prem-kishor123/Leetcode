class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int degree = 0, ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new int[]{0, i, i}); 
            int[] v = map.get(nums[i]);
            v[0]++; v[2] = i;
            degree = Math.max(degree, v[0]);
        }

        for (int[] v : map.values())
            if (v[0] == degree)
                ans = Math.min(ans, v[2] - v[1] + 1);

        return ans;
    }
}