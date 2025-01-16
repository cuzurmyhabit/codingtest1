import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        int[] score = {0,3,2,1,0,1,2,3};
        String[] user = {"R","T","C","F","J","M","A","N"};
        int[] calc = {0,0,0,0,0,0,0,0};

        int index = 0;
        for(int i=0; i<survey.length; i++){
            int target = choices[i];
            String[] temp = {survey[i].substring(0,1), survey[i].substring(1,2)};
            if( choices[i] < 4){
                index = Arrays.asList(user).indexOf(temp[0]);
                calc[index] += score[target];
            }else {
                // 5~7점일 때
                index = Arrays.asList(user).indexOf(temp[1]);
                calc[index] += score[target];
            }
        }
        for (int i = 0; i < user.length; i += 2) {
            if (calc[i] < calc[i + 1]) {
                answer += user[i + 1];
            } else {
                answer += user[i];
            }
        }
        return answer;
    }
}