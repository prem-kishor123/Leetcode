class Solution {
    public int gcdOfOddEvenSums(int n) {
    
    int sumodd=0;
    int sumeven=0;

    int odd=1;
    int even=2;
    
    for(int i=0;i<n;i++){
        sumodd+= odd;
        sumeven+= even;

      odd+=2;
      even+=2;

    }
      return gcd(sumodd,sumeven) ;
    }

    private int gcd(int a,int b){
        while(b!=0){
            int tempt=b;
            b=a%b;
            a=tempt;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna