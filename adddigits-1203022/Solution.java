class Solution {
    public int addDigits(int num) {
        if (num<10){
            return num;
        }
        int Solu=addSum(num);
         return Solu; }
    public int addSum(int nums){
        String number= String.valueOf(nums);
        String[] digits =number.split("(?<=.)");
        int[] sum=new int[digits.length];
        int ans=0;
            for(int i=0;i<sum.length;i++){
                sum[i]=Integer.parseInt(digits[i]);
            }
        for(int j=0;j<sum.length;j++){
            ans+=sum[j];
        }
        if(ans>=10){
           int web= addSum(ans);
            return web;
        }
        else{return ans;} 
    }
}