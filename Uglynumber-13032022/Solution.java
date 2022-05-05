class Solution {
    public boolean isUgly(int n) {
        boolean Ans=true;
        if(n==1||n==2||n==3||n==5){
            return Ans=true;
        }
        int byt=n/2;
        int byth=n/3;
        int byf=n/5;
        if(byt==3||byt==5||byth==2||byth==5||byf==2||byf==3){
            return Ans=true;
        }
       
    }         
}