class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++)       //array의 길이 .length
        {
            if(array[i]>height)
            {
                answer++;
            }
        }
        return answer;
    }
}