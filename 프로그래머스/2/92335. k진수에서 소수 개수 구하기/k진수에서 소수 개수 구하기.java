import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String kNum = Integer.toString(n, k);
        String[] parts = kNum.split("0");

        for (String part : parts) {
            if (part.isEmpty()) {
                continue;
            }
            
            if (isPrime(Long.parseLong(part))) {
                answer++;
            }
        }
        
        return answer;
    }

    public boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}