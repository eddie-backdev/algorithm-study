class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int aTemp = 0;
        for(int i = 0 ; i<queries.length ; i++){
            aTemp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = aTemp;
        }
        return arr;
    }
}