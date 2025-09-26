class Solution {
    static int[] memo;
    
    public int solution(int n) {
        int answer = 0;
        memo = new int[n + 1];
        answer = fibo(n);
        
        
        return answer;
    }
    
    public int fibo(int n) {
        if (n <= 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n] % 1234567;
        } else {
            return memo[n] = (fibo(n - 1) + fibo(n - 2)) % 1234567;
        }
    }
}