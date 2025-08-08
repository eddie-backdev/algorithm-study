class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                answer++;
                dfs(visited, computers, i);
            }
        }
        return answer;
    }
    
    public void dfs(boolean[] visited, int[][] computers, int node) {
        visited[node] = true;
        
        for (int i = 0; i < computers.length; i++) {
           if (visited[i] == false && computers[node][i] == 1) {
               dfs(visited, computers, i);
           }
        }
    }
}