class Solution {
    public String[] solution(String myStr) {
        String s = myStr.replaceAll("[a-c]", " ");
        
        if (s.trim().isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return s.trim().split("\\s+");
        }
    }
}