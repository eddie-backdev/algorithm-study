import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        int load = 0;
        int time = 0;

        for (int truck : truck_weights) {
            while (true) {
                if (bridge.size() == bridge_length) {
                    load -= bridge.poll();
                }
                
                if (load + truck <= weight) {
                    load += truck;
                    bridge.add(truck);
                    time++;
                    break;
                } else {
                    bridge.add(0);
                    time++;
                }
            }
        }
        return time + bridge_length;
    }
}