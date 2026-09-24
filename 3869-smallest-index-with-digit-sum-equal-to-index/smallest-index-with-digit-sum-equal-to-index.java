class Solution {
    public int smallestIndex(int[] nums) {
        int minIdx = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= 9 && i == nums[i]){
                minIdx = i;
                break;
            }
            else{
                if(nums[i] >= 10){
                    int temp = nums[i];
                    int sum = 0;
                    while(temp > 0){
                        sum += temp % 10;
                        temp = temp / 10;
                    }
                    if(sum == i){
                        minIdx = i;
                        break;
                    }
                }
            }
        }
        return minIdx;
    }
}