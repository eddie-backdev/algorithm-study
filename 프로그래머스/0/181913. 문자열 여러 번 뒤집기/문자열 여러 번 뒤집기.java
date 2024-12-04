class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i<queries.length; i++){
            StringBuffer reverse = new StringBuffer(my_string.substring(queries[i][0],queries[i][1]+1));
            String reverse_ = reverse.reverse().toString();

            String left = my_string.substring(0,queries[i][0]);
            String right = my_string.substring(queries[i][1]+1);
            my_string= left+reverse_+right;
        }
        
        return my_string;
    }
}