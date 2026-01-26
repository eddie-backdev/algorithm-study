import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Pattern p = Pattern.compile("^(\\D+)(\\d{1,5})");

        Arrays.sort(files, (s1, s2) -> {
            Matcher m1 = p.matcher(s1);
            Matcher m2 = p.matcher(s2);

            m1.find();
            m2.find();

            String head1 = m1.group(1);
            String head2 = m2.group(1);
            
            int result = head1.compareToIgnoreCase(head2);
            
            if (result != 0) {
                return result;
            }

            int num1 = Integer.parseInt(m1.group(2));
            int num2 = Integer.parseInt(m2.group(2));

            return num1 - num2;
        });

        return files;
    }
}