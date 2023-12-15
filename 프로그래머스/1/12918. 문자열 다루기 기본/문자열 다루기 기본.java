import java.util.*;

class Solution {
    public boolean solution(String s) {
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(!Character.isDigit(tmp)){
                return false;
            }
        }
        
        return true;
    }
}