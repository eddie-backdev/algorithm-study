import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] c1 = before.toCharArray();
        char[] c2 = after.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        String str1 = new String(c1);
        String str2 = new String(c2);
        
        return str1.equals(str2) ? 1 : 0;
    }
}