class Solution {
    public int[] solution(int[] arr) {
        int min = 2147000000;
        int cnt = 0;
        
        for(int i=0; i<arr.length;i++){
            if(min >= arr[i]){
                cnt = i;
                min = arr[i];
            }
        }
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[arr.length-1];
            int idx = 0;
            for(int i=0; i<arr.length; i++){
                if(i != cnt){
                    answer[idx] = arr[i];
                    idx++;
                }    
            }
            return answer;
        }
    }
}