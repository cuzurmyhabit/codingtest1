public class Solution {
    public static int solution(int order) {
        int answer = 0;
        int temp;
        
        while (true) {
            temp = order % 10;
            if (temp != 0 && temp % 3 == 0) {
                answer++;
            }
            order = order / 10;
            if (order == 0) {
                break;
            }
        }
        
        return answer;
    }
}
