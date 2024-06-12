import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;       //예산 결과
        
        Arrays.sort(d);      //오름차순 정렬
        
        for(int i = 0; i < d.length; i++){
            result += d[i];
            
            if(result > budget){
                answer=i;
                break;
            }  
            
            if(result <= budget)
                answer = d.length;
        }
        
        return answer;
    }
}