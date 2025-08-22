class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        char[] newIdArr = new_id.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : newIdArr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        new_id = sb.toString();
        
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        
        if (new_id.startsWith(".")) new_id = new_id.substring(1, new_id.length());
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);
        
        if (new_id.equals("")) new_id = "a";
        
        if (new_id.length() > 15) new_id = new_id.substring(0, 15);
        if (new_id.endsWith(".")) new_id = new_id.substring(0, 14);
        
        if (new_id.length() < 3) {
            char c = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id = new_id + c;
            }
        }
        
        return new_id;
    }
}