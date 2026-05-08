class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int ascii=(int)s.charAt(i);
            sum+=(i+1)*(123-ascii);
        }  
        return sum;
    }
}