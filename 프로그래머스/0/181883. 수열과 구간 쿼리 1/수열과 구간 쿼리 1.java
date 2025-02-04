class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] arri : queries) {
            int s = arri[0];
            int e = arri[1];
            
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}