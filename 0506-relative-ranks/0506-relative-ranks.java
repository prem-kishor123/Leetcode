class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->b[0]-a[0]
        );
        for(int i=0;i<score.length;i++){
            pq.add(new int[]{score[i],i});
        }
        int rank=1;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int i=curr[1];
            if(rank==1){
                ans[i]="Gold Medal";
            }else if(rank==2){
                ans[i]="Silver Medal";
            }
            else if(rank==3){
                ans[i]="Bronze Medal";
            }else{
                ans[i]=String.valueOf(rank);
            }
            rank++;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna