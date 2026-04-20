class Solution {
    public int maxDistance(int[] colors) {
      int i = 0 , j = colors.length -1;
      int max = Integer.MIN_VALUE ;
      while(i < j){
        if(colors[i] != colors[j]){
            max = Math.max(Math.abs(j-i), max ) ;
        }
        j--;
      } 
      i =0 ;
       j = colors.length -1 ;
       while(i < j){
        if(colors[i] != colors[j]){
           max = Math.max(Math.abs(j-i), max ) ;
        }
        i++;
      } 
      return max ; 
    }
}