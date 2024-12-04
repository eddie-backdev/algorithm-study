import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkList = new ArrayList();
        int idx = 0;
        int temp = 0;
        while(idx<arr.length){
            
            if(stkList.isEmpty()){
                stkList.add(arr[idx]);
                idx++;
            }
            else {
                temp = stkList.get(stkList.size()-1);
                if(temp < arr[idx]){
                    stkList.add(arr[idx]);
                    idx++;
                }
                else if(temp >= arr[idx]){
                    stkList.remove(stkList.size()-1);
                }
            }
        }
        
        int[] stk = stkList.stream().mapToInt(i -> i).toArray();
        
        return stk;
    }
}