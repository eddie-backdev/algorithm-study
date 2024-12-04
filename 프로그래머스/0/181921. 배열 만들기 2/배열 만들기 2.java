import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList();
        int[] minus = {-1};
        for(int i=l; i<=r; i++){
            int cnt = 0;
            String length = i+"";
            for(int j=0; j<length.length(); j++){
                if(length.charAt(j)== 48 || length.charAt(j)==53){
                    cnt++;
                }
            }            
            if(cnt == length.length()){
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()) return minus;
        int[] answer_ = answer.stream().mapToInt(i -> i).toArray();
        return answer_;
    }
}