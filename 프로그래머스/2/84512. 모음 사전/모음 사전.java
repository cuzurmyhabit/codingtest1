import java.util.ArrayList;
import java.util.List;
class Solution {
    static List<String> list;
    static String [] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        a("", 0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    static void a(String str, int len) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            a(str + words[i], len + 1);
        }
    }
}