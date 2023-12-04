class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String num = "";
        String star = "*";
        num = phone_number.substring(len);
        return star.repeat(len)+num;
        
    }
}