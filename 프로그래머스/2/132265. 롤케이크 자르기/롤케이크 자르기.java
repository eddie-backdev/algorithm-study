import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        
        for(int i=0;i<topping.length;i++) {
            map1.put(topping[i],map1.getOrDefault(topping[i],0)+1);
        }
		
        for(int j=0;j<topping.length;j++) {
            map2.put(topping[j],map2.getOrDefault(topping[j],0)+1);
            map1.put(topping[j],map1.getOrDefault(topping[j],0)-1);
            
            if(map1.getOrDefault(topping[j],0) == 0) {
                map1.remove(topping[j]);
            }
            
            if(map1.size() == map2.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}