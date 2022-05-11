class Solution {
    public static int mySqrt(int x) {
        int due=0;
        for (int i =1 ;i<=x;i++){
             due=x/i;
            if(due==i){
                       due=i; 
                      break;
                    }
         } 
     
    return due;
    }
    public static void main (String[] args){
            int sqr=8;
            int a = mySqrt(sqr);
            System.out.println(""+a);
                }
     
}