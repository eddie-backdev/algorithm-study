import java.util.*;

class Solution {
    
    static int[][] arr;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        arr= new int[n+1][n+1];
        
        //1. 인접행렬에 input
        for(int i=0; i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]]=1;
            arr[wires[i][1]][wires[i][0]]=1;
        }
        
        //2. 선을 하나씩 끊어보며 순회
        int a, b;
        for(int i=0; i<wires.length; i++){
            a= wires[i][0];
            b= wires[i][1];
            
            //선을 하나 끊고
            arr[a][b]=0;
            arr[b][a]=0;
            
            //bfs
            answer= Math.min(answer, bfs(n, a));
            
            //선 다시 복구
            arr[a][b]=1;
            arr[b][a]=1;
        }
        
        return answer;
    }
    
    public int bfs(int n, int start){
        int[] visit= new int[n+1];
        int cnt=1;
        
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        
        while(!q.isEmpty()){
            int point= q.poll();
            visit[point]= 1;
            
            for(int i=1; i<=n; i++){
                if(visit[i]==1) continue;
                if(arr[point][i]==1) {
                    q.offer(i);
                    cnt++;
                }
            }
        }
        return (int)Math.abs(n-2*cnt);
    }
}