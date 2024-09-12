import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> Q = new PriorityQueue<>();

        for(int i=0; i<score.length; i++){
            Q.add(score[i]);
            if(Q.size()>k){
                Q.remove();
            }
            answer[i]=Q.peek();
        }
        return answer;
    }
}