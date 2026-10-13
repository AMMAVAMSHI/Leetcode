class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] = -(nums[i]);
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        int arr[] = new int[n];
        int start = n-1;
        for(int i=n-1;i>=0;i--){
            if(i % 2 == 0){
                arr[i] = nums[start];
                start--;;
            }
        }
        //start = n-2;
        for(int i=n-1;i>=0;i--){
            if(i % 2 != 0){
                arr[i] = nums[start];
                start--;
            }
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                sum += (long)arr[i] * arr[i];
            }
            else{
                sum -= (long)arr[i] * arr[i];
            }
        }
        return sum;
    }
}