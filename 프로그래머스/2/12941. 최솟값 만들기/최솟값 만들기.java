import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] Bboxed = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(A);
        Arrays.sort(Bboxed, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * Bboxed[i];
        }

        return answer;
    }
}