class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int arr[] = new int[len];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        int j = 0;
        for(int i=nums1.length;i<len;i++){
            arr[i] = nums2[j];
            j++;
        }
        Arrays.sort(arr);
        if(len % 2 == 0){
            return (double)(arr[len/2]+arr[len/2-1])/2;
        }
        else return (double)arr[len/2];
    }
}