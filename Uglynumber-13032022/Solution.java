class Solution {
    public boolean isUgly(int n) {
        boolean Ans;
        Ans=findUgly(n);
       return Ans; 
    }
    public boolean findUgly(int n){
        boolean jab;
        if(n==1||n==2||n==3||n==5||n/2==3||n/2==5||n/3==2||n/3==5||n){
            return jab=true;
        }
        
        int h=n/2;

        if(h/3!=1 || h/5!=1){
            return jab=false;
        }
        else{
            return jab=true;
        }
    }
}