class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.substring(0,0) == "-"){
            String tmp = s.substring(1);
            answer = Integer.parseInt(tmp) * -1;
        }else{
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}