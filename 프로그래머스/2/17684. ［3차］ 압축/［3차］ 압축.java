import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        int index = 27;
        
        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }
        
        for (int i = 0; i < msg.length(); ) {
            String w = "";
            int j = i + 1;
            
            while (j <= msg.length()) {
                String temp = msg.substring(i, j);
                if (dictionary.containsKey(temp)) {
                    w = temp;
                    j++;
                } else {
                    break;
                }
            }

            answer.add(dictionary.get(w));

            if (j <= msg.length()) {
                String c = String.valueOf(msg.charAt(j - 1));
                dictionary.put(w + c, index++);
            }
            
            i += w.length();
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}