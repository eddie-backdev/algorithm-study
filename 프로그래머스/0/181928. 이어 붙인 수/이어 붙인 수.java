class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        int odd_ = 0;
        int even_ = 0;
        
        for(int a : num_list){
            //System.out.print(a);
            if(a % 2 == 1){
                odd += Integer.toString(a);
            }
            else{
                even += Integer.toString(a);
            }
        }
        odd_ = Integer.parseInt(odd);
        even_ = Integer.parseInt(even);
        
        
        return odd_+even_;
    }
}