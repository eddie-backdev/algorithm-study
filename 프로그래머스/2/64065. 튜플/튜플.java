import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);

        String[] parts = s.split("\\},\\{");

        List<int[]> list = new ArrayList<>();
        for (String part : parts) {
            String[] nums = part.split(",");
            int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            list.add(arr);
        }

        list.sort(Comparator.comparingInt(a -> a.length));

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int[] arr : list) {
            for (int num : arr) {
                if (!seen.contains(num)) {
                    seen.add(num);
                    result.add(num);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
