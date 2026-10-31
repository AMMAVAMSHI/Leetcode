class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int arr[] = new int[n*(n+1)/2];
        int idx = 0;
        for(int i = 0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += nums[k];
                }
                arr[idx] = sum;
                idx++;
            }
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i=left-1;i<right;i++){
            sum += arr[i];
        }
        return (int)(sum % 1000000007);
    }
}