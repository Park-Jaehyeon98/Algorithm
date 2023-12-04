class Solution {
    public long solution(long n) {

        double tmp = Math.sqrt(n);
        if(tmp % 1 == 0.0){
            int num = (int)tmp + 1;
            return (long)Math.pow(num, 2);
        }
        return -1;
    }
}