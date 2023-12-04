class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int idx = 0;
        while(true){
            if(n <= 0){
                break;
            }
            int tmp = (int)(n % 10);
            answer[idx] = tmp;
            n /= 10;
            idx++;
        }
        
        return answer;
    }
}