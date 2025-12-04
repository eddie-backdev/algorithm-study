import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for(int i = 0; i < operations.length; i++) {
            String[] s = operations[i].split(" ");
           
            if(s[0].equals("D") && max.isEmpty()) {
                continue;
            } else if(s[0].equals("I")) {
                max.offer(Integer.parseInt(s[1]));
                min.offer(Integer.parseInt(s[1]));
            } else if(s[0].equals("D") && s[1].equals("1")) {
                int maxValue = max.poll();
                min.remove(maxValue);
            } else {
                int minValue = min.poll();
                max.remove(minValue);
            }
        }

        if(max.isEmpty()) {
            return new int[] {0,0};
        }
        else {
            return new int[] {max.poll(), min.poll()};
        }
    }
}