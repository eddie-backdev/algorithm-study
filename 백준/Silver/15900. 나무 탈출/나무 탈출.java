import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] tree;
    static int n;
    static long totalDepth = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(1, 0, 0);

        if (totalDepth % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void dfs(int node, int parent, int depth) {
        boolean isLeaf = true;

        for (int next : tree[node]) {
            if (next != parent) {
                isLeaf = false;
                dfs(next, node, depth + 1);
            }
        }

        if (isLeaf && node != 1) {
            totalDepth += depth;
        }
    }
}
