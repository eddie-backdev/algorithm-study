import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> list1 = func1(str1);
        List<String> list2 = func1(str2);
        
        if (list1.isEmpty() && list2.isEmpty()) {
            return 65536;
        }
        
        List<String> union = new ArrayList<>();
        List<String> inter = new ArrayList<>();

        for (String s : list1) {
            if (list2.remove(s)) {
                inter.add(s);
            }

            union.add(s);
        }

        union.addAll(list2);

        double jacquard = (double) inter.size() / (double) union.size();

        answer = (int) (jacquard * 65536);
        return answer;
    }
    
    public List<String> func1(String str) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.toLowerCase().substring(i, i + 2).replaceAll("[^a-z]", "");

            if (s.length() < 2) {
                continue;
            }
            
            list.add(s);
        }
        
        return list;
    }
}