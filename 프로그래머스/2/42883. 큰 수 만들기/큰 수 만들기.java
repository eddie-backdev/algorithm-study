class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < number.length(); i++) {
            char curNum = number.charAt(i);
            
            while (k > 0 && sb.length() > 0 && curNum > sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            
            sb.append(curNum);
        }
        
        if (k > 0) {
            sb.delete(sb.length() - k, sb.length());
        }
        return sb.toString();
    }
}