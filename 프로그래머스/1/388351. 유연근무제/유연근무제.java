import java.util.*;

public class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        int[] end = new int[schedules.length];
        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            int newTime = (hour * 100 + minute + 10);
            
            if (newTime % 100 >= 60) {
                newTime += 40;
            }
            end[i] = newTime;
        }

        for (int i = 0; i < timelogs.length; i++) {
            boolean t = true;
            
            for (int j = 0; j < 7; j++) {
                int act = (startday + j - 1) % 7;
                
                if (act == 5 || act == 6) {
                    continue;
                }

                if (timelogs[i][j] > end[i]) {
                    t = false;
                    break;
                }
            }

            if (t) {
                answer++;
            }
        }
        
        return answer;
    }
}