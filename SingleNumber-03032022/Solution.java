class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++) 
        {
            if(nums[i]!=nums[i+1]) return nums[i];
            else i++;
        }
        return nums[nums.length-1];
 }
    
}
