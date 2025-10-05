import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String cur = words[i];

            if (set.contains(cur)) {
                int player = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{player, turn};
            }

            if (i > 0) {
                String prev = words[i - 1];
                char last = prev.charAt(prev.length() - 1);
                char first = cur.charAt(0);
                if (last != first) {
                    int player = (i % n) + 1;
                    int turn = (i / n) + 1;
                    return new int[]{player, turn};
                }
            }

            set.add(cur);
        }

        return new int[]{0, 0};
    }
}
