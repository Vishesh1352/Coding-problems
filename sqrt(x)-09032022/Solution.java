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
    
     
}