import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = my_string.toCharArray();
        Set<Character> cSet = new HashSet<>();
        
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!cSet.contains(c)) {
                cSet.add(c);
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}