class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean b = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                b = true;
            }
            else{
                b = false;
                break;
            }
        }
        if(b){
            return true;
        }
        b = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
                b = true;
            }
            else{
                b = false;
                break;
            }
        }
        if(b){
            return true;
        }
        return false;
    }
}