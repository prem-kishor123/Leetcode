class Solution {
    public int[] plusOne(int[] digits) {

      int n=digits.length;

      for(int i=n-1; i>=0; i--){
        if(digits[i] < 9){
            digits[i]++;
            return digits;

        }
        digits[i]=0;
      }
        int result[]= new int[n+1];
         result[0]=1;
         return result;
          }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna