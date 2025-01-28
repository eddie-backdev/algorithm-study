import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        return Math.min(length, set.size());
    }
}