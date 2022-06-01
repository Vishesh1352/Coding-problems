class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size= nums.length;
        boolean ans=true;
        int count=0;
        for(int i=0;i<size-1;i++){
            for(int j=size-1;j>=0;j--){
                if(i==j){continue;}
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if(count==0){
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;
    } 
}