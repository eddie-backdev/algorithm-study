class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int a : index_list){
            answer += my_string.charAt(a);
        }
        return answer;
    }
}