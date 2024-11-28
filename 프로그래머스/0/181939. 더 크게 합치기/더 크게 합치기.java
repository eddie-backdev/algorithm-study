class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a_ = Integer.toString(a);
        String b_ = Integer.toString(b);
        
        String temp1 = a_ + b_;
        String temp2 = b_ + a_;
        int aa = Integer.parseInt(temp1);
        int bb = Integer.parseInt(temp2);
        
        if(aa>bb)answer=aa;
        else answer=bb;
        return answer;
    }
}