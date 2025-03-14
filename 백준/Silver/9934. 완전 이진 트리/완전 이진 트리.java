import java.util.*;

public class Main {
    static int K;
    static int[] inorder;
    static List<List<Integer>> levels;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        int N = (int) Math.pow(2, K) - 1;
        inorder = new int[N];
        levels = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            levels.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            inorder[i] = sc.nextInt();
        }

        buildTree(0, N - 1, 0);

        for (List<Integer> level : levels) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    static void buildTree(int left, int right, int depth) {
        if (left > right) return;

        int mid = (left + right) / 2;
        levels.get(depth).add(inorder[mid]);

        buildTree(left, mid - 1, depth + 1);

        buildTree(mid + 1, right, depth + 1);
    }
}
