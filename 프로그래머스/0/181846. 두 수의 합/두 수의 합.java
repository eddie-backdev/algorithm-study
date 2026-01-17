import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger ba = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger answer = ba.add(bb);
        
        return answer.toString();
    }
}