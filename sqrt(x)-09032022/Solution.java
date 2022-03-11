class Solution {
    public int mySqrt(int x) {
          int a= root(x);
        return a;
    }
     public int root(int y){
            
            for (int i =1 ;i<=y/2;i++){
              int z=y%i;
             if(z==i){
                int r=0;
                r=z;
                break;
                    }
                 
                }
             return r;
             
             }
}