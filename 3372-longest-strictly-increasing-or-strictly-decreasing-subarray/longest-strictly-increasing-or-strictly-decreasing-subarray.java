class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxDec = 1;
        int maxInc = 1;
        int dec = 1;
        int inc = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                inc++;
            } else {
                inc = 1;
            }
            if (nums[i] < nums[i-1]) {
                dec++;
            } else {
                dec = 1;
            }
            maxDec = Math.max(maxDec, dec);
            maxInc = Math.max(maxInc, inc);
        }
        return Math.max(maxInc, maxDec);
    }
}