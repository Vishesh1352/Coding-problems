class Solution {
    public boolean isUgly(int n) {
        boolean Ans=true;
        Ans=findUgly(n);
       return Ans; 
    }
    public boolean findUgly(int n){
        boolean Sol;
        if(n==1){
            return Sol=true;
        }
        
        int h=n/2;
        if(h!=3||h!=5){
            return Sol=false;
        }
        else{
            return Sol=true;
        }
    }
}   