class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int index =0;
        for(int i=0;i<nums.length;i++){
            int y =nums[i];
            for (int j =i+1;j<nums.length;j++){
                if(nums[j]==y){
                    count++;
                }
                else{
                    nums[index-count]=nums[index];
                }
                index++;
            }
        }
        return nums.length-count;
    }
}