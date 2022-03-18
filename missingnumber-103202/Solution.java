class Solution {
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int ans=0;
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<size;j++){
               if(i==nums[j]){
                   break;
               }
           }
        ans=i;} 
    return ans;}
    public static void main(String [] args){
        int[]  que ={1,0};
        int a = missingNumber(que);
        System.out.println(""+a);
    }
}