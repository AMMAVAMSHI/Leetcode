class Solution {
    public long sumAndMultiply(int n) {
        
        long sum = 0;
        int temp = n;
        long num = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            if(rem != 0){
                num = 10*num + rem;
            }
            temp /= 10;
        }
        long newNum = 0;
        while(num > 0){
            long rem = num % 10;
            newNum = newNum*10+rem;
            num /= 10;
        }
        return newNum * sum;
    }
}