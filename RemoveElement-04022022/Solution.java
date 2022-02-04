class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0; 

        for (int i = 0; i < nums.length; i++) {

            if (nums[index] == val) {
                count++;
            } else {
                nums[index - count] = nums[i];
            }
			
            index++;
        }
        return nums.length - count;
    }

}
        
