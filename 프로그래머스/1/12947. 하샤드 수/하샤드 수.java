class Solution {
    public boolean solution(int x) {
        int mul = 0;
        String tmp = Integer.toString(x);
        for(int i = 0; i<tmp.length();i++){
            mul += tmp.charAt(i) - '0';
        }
        if(x % mul == 0)
            return true;
        else
            return false;
    }
}