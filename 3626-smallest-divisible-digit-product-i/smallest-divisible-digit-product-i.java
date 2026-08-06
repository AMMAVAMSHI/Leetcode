class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitProduct(n) % t == 0){
                return n;
            }
            else{
                n++;
            }
        }
    }
    static int digitProduct(int n){
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            product *= rem;
            n /= 10;
        }
        return product;
    }
}