class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        
        for(int a : num_list){
            multi *= a;
            sum += a;
        }
        
        sum *= sum;
        
        if(multi > sum) return 0;
        
        return 1;
    }
}