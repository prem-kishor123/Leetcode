class Solution {
    public boolean judgeCircle(String moves) {
     int  r = 0 , l = 0 , u = 0 , d = 0 ;
     for(char a : moves.toCharArray()){
        if(a == 'U'){
            u++ ;
        }else if(a == 'D'){
            d++ ;
        }else if(a == 'L'){
            l++ ;
        }else{
            r++ ;
        }
     }   
     if(u-d == 0 && r-l == 0){
        return true ;
     }
     return false ;
    }
}