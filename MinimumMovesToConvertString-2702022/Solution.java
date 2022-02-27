class Solution {
    public int minimumMoves(String s) {
         int moves = 0;
        int i=0;
        
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                moves++;
            }else
                i++;
        }      
        return moves;
    }
}