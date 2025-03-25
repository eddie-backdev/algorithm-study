import java.util.*;

class Solution {
    static String[] arr = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        
        dfs(word, "", 0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public void dfs(String word, String str, int depth) {
        list.add(str);
        
        if (depth == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            dfs(word, str + arr[i], depth+1);
        }
    }
}