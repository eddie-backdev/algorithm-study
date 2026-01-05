import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];

        int min = Math.abs(n - array[0]); 
        
        for (int i = 1; i < array.length; i++) {
            int temp = Math.abs(n - array[i]);

            if (temp < min) {
                min = temp;
                answer = array[i];
            }
        }
        
        return answer;
    }
}