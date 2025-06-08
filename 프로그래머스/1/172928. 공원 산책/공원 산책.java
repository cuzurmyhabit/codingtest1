import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int x = -1;  // 현재 위치의 x 좌표 (가로)
        int y = -1;  // 현재 위치의 y 좌표 (세로)

        int height = park.length;           // 공원의 세로 길이
        int width = park[0].length();       // 공원의 가로 길이

        // 공원을 순회하면서 시작 위치 'S' 찾기
        for (int i = 0; i < height; i++) {
            if (park[i].indexOf('S') != -1) {
                x = park[i].indexOf('S');   // x는 해당 행에서의 인덱스
                y = i;                      // y는 해당 행 번호
                break;
            }
        }

        // 강아지 이동 명령 수행
        for (int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");
            String direction = temp[0];              // 이동 방향 (E, W, S, N)
            int distance = Integer.parseInt(temp[1]); // 이동 거리

            int currX = x; // 이동을 시뮬레이션할 임시 좌표
            int currY = y;
            boolean isValid = true; // 이동 가능한지 여부

            // 방향에 따른 이동 시뮬레이션
            if (direction.equals("E")) {
                for (int j = 1; j <= distance; j++) {
                    currX++;
                    if (currX >= width || park[currY].charAt(currX) == 'X') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) x = currX; // 이동이 유효하면 위치 갱신
            }

            else if (direction.equals("W")) {
                for (int j = 1; j <= distance; j++) {
                    currX--;
                    if (currX < 0 || park[currY].charAt(currX) == 'X') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) x = currX;
            }

            else if (direction.equals("S")) {
                for (int j = 1; j <= distance; j++) {
                    currY++;
                    if (currY >= height || park[currY].charAt(currX) == 'X') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) y = currY;
            }

            else if (direction.equals("N")) {
                for (int j = 1; j <= distance; j++) {
                    currY--;
                    if (currY < 0 || park[currY].charAt(currX) == 'X') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) y = currY;
            }
        }

        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}