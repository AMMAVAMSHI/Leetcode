class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int prodZero = 1;
        int zeroCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                prodZero *= nums[i];
            }
            else{
                zeroCount++;
            }
            prod *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount > 1){
                nums[i] = 0;
            }else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    nums[i] = prodZero;
                } else {
                    nums[i] = 0;
                }
            }
            
            else {
                nums[i] = prod/nums[i];
        }
        }
        return nums;
    }
}