import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        
        
        return Math.max(num1, num2);
    }
}