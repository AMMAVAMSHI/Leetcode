class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while(n > 0){
            int rem = n % 10;
            if(rem >= max){
                secondMax = max;
                max = rem;
            }
            else if(rem > secondMax && rem < max){
                secondMax = rem;
            }
            n /= 10;
        }
        return secondMax * max;

    }
}