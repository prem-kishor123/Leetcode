class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack= new Stack<>();
        int maxarea=0;
        int n= heights.length;
        for(int i=0;i<=n;i++){
            int currentheight=(i==n) ? 0: heights[i];
            while(!stack.isEmpty() && currentheight< heights[stack.peek()]){
                int height= heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                 width = i;
              } else {
    width = i - stack.peek() - 1;
}
                maxarea=Math.max(maxarea,height*width);
            }
            stack.push(i);
        }
   return maxarea;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna