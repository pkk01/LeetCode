class Solution {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > nums.length-1 && nums[i] == val) {
                continue;
            }
            else if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}