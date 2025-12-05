import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[arr.length];
        
        int index = 0;

        for (int num : arr) {
            if (index == 0 || temp[index - 1] != num) {
                temp[index++] = num;
            }
        }

        return Arrays.copyOf(temp, index);
    }
}