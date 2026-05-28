class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

  List<Integer> ans = new ArrayList<>();
       HashMap <Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) <=k){
                ans.add(num);
            }
        }
        int[] result= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna