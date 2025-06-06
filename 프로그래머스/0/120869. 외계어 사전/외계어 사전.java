class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int count = 0;

        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    count++;
                }
                if(count == spell.length){
                    answer = 1;
                    break;
                }
            }
            count = 0;
        }
        return answer;
    }
}