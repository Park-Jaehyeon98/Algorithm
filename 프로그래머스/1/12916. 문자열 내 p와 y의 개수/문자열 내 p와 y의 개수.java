import java.util.*;

class Solution {
    boolean solution(String s) {
        int ycnt = 0;
        int pcnt = 0;
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p')
                pcnt++;
            else if(s.charAt(i)=='y')
                ycnt++;
        }
        
        return pcnt == ycnt;
    }
}