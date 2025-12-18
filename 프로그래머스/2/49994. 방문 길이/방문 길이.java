import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        
        int x = 5, y = 5;
        
        for (char c : dirs.toCharArray()) {
            int nx = x;
            int ny = y;
            
            if (c == 'U') {
                nx--;
            } else if (c == 'D') {
                nx++;
            } else if (c == 'L') {
                ny--;
            } else if (c == 'R') {
                ny++;
            }
            
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
            
            String path1 = x + "" + y + "" + nx + "" + ny;
            String path2 = nx + "" + ny + "" + x + "" + y;
            
            
            if (!visited.contains(path1) && !visited.contains(path2)) {
                visited.add(path1);
            }
            
            x = nx;
            y = ny;
        }
        
        return visited.size();
    }
}