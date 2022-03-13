class Solution {
    public int mySqrt(int x) {
          root(x);
        return x;
    }
     public int root(int y){
            
            for (int i =1 ;i<=y/2;i++){
              int z=y%i;
             if(z==i){
               y=z;
                    }
                 
                }
             return y;
             }
}