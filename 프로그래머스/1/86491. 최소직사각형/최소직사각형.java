import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxRow = 0;
        int maxCol = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        for (int i = 0; i < sizes.length; i++) {
            if (maxCol < sizes[i][0])
                maxCol = sizes[i][0];
            
            if (maxRow < sizes[i][1])
                maxRow = sizes[i][1];
        }
        
        return maxRow * maxCol;
    }
}