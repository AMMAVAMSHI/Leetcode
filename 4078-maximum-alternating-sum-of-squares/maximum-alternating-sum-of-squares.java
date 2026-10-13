class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] = -(nums[i]);
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        
        long sum = 0;
        for(int i=0;i<n;i++){
            if(i < n/2){
                sum -= (long)nums[i] * nums[i];
            }
            else{
                sum += (long)nums[i] * nums[i];
            }
        }
        return sum;
    }
}