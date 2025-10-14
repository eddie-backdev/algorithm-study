class Solution {
    public String solution(String myString) {
        char[] myStringArr = myString.toCharArray();
        
        for (int i = 0; i < myStringArr.length; i++) {
            if (myStringArr[i] < 108) {
                myStringArr[i] = 'l';
            }
        }
        
        return String.valueOf(myStringArr);
    }
}