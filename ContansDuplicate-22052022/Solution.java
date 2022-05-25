class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size= nums.length;
        boolean ans=true;
        for(int i=0;i<size-1;i++){
            for(int j=size-1;j>=0;j--){
                if(nums[i]==nums[j-1]){
                    ans=true;
                    break;
                }
                else{
                    ans=false;
                }
            }
        }
        return ans;
    } 
}