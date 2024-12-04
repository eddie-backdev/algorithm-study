import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int aTemp = 0;
        for(int j = 0 ; j<queries.length ; j++){
            answer[j]=Integer.MAX_VALUE;
            for(int i = queries[j][0] ; i<=queries[j][1] ; i++){
                if(arr[i] > queries[j][2]){
                    answer[j] = Math.min(arr[i],answer[j]);
                }
            }
            if(answer[j]==Integer.MAX_VALUE)answer[j]=-1;
        }
        return answer;
    }
}