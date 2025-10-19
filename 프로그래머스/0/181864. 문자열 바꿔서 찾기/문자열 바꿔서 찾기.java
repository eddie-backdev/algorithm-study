class Solution {
    public int solution(String myString, String pat) {
        char[] myStringArr = myString.toCharArray();
        
        for (int i = 0; i < myStringArr.length; i++) {
            myStringArr[i] = myStringArr[i] == 'A' ? 'B' : 'A';
        }
        
        myString = String.valueOf(myStringArr);
        
        boolean answer = myString.contains(pat);
        return answer ? 1 : 0;
    }
}