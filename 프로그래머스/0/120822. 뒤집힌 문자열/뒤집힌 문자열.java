class Solution {
    public String solution(String my_string) {
        StringBuilder reversedString = new StringBuilder(my_string);
        
        reversedString.reverse(); // 문자열을 뒤집음
        return reversedString.toString();
    
    }
}