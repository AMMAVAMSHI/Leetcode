class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxEle = nums[0];
        int maxFreq = map.get(maxEle);
        for(int i=1;i<nums.length;i++){
            if(map.get(nums[i]) > maxFreq){
                maxEle = nums[i];
            }
        }
        return maxEle;
    }
}