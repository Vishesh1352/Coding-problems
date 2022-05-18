class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int index =0;
        int index2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[index]==nums[index2]){
                count++;
                
            }
            else{
                nums[index]=nums[index2];
           
        }
        return nums.length-count;
    }
}
