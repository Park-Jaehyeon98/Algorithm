import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String tmp = Long.toString(n);
        
        Integer[] arr = new Integer[tmp.length()];
        for(int i=0; i<tmp.length(); i++){
            arr[i] = tmp.charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i : arr){
            answer = answer * 10 + i;
        }
        
        return answer;
    }
}