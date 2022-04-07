class Solution {
    public static String toHex(int num) {
                String Ans="";
                while(num/16!=0){
                    int rem=num%16;
                    num=num/16;
                    if(rem>=10){
                          
                    }
                    Ans=""+rem;
                }
                return Ans; 
            }
    