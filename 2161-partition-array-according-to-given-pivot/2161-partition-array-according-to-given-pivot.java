class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    
   int[] arr =new int[nums.length];
   int index=0;

   for( int num : nums)
     if(num < pivot)
    arr[index++] = num;

     for( int num : nums)
     if(num == pivot)
     arr[index++] = num;

     for( int num : nums)
     if(num > pivot)
     arr[index++]= num;
     return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna