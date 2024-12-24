class Solution {
    static boolean[] visited;
    static int maxDG;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        maxDG(k, dungeons, 0);
        return maxDG;
    }
    
    public void maxDG(int k, int[][] dungeons, int count) {
        maxDG = Math.max(maxDG, count);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                maxDG(k - dungeons[i][1], dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}