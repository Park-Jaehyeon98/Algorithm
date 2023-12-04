import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        boolean flag = false;
        int cnt = 0;
        int[] answer = {};
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
                flag = true;
            }
        }
        if(flag){
            answer = new int[cnt];
            cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
        }
        else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}