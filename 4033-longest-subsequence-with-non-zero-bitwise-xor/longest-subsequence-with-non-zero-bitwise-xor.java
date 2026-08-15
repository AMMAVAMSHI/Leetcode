class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        for(int i=0;i<nums.length;i++){
            totalXor ^= nums[i];
        }
        if(totalXor != 0){
            return nums.length;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                return nums.length-1;
            }
        }
        return 0;
    }
}