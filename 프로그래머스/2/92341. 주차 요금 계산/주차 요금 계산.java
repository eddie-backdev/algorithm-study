import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> totalTimes = new TreeMap<>();

        for (String record : records) {
            String[] part = record.split(" ");
            int time = getMinutes(part[0]);
            String carNum = part[1];
            String type = part[2];

            if (type.equals("IN")) {
                parking.put(carNum, time);
            } else {
                int inTime = parking.remove(carNum);
                int duration = time - inTime;
                totalTimes.put(carNum, totalTimes.getOrDefault(carNum, 0) + duration);
            }
        }

        int endTime = getMinutes("23:59");
        for (String carNum : parking.keySet()) {
            int inTime = parking.get(carNum);
            int duration = endTime - inTime;
            totalTimes.put(carNum, totalTimes.getOrDefault(carNum, 0) + duration);
        }

        int[] answer = new int[totalTimes.size()];
        int idx = 0;

        for (String carNum : totalTimes.keySet()) {
            int time = totalTimes.get(carNum);

            if (time <= fees[0]) {
                answer[idx] = fees[1];
            } else {
                int exceededTime = time - fees[0];
                int unitFee = (int) Math.ceil((double) exceededTime / fees[2]) * fees[3];
                answer[idx] = fees[1] + unitFee;
            }
            idx++;
        }

        return answer;
    }

    private int getMinutes(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}