class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_stringArr = my_string.toCharArray();
        
        my_stringArr[num1] = my_string.charAt(num2);
        my_stringArr[num2] = my_string.charAt(num1);
        
        return String.valueOf(my_stringArr);
    }
}