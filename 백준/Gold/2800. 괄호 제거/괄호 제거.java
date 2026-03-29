import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    static List<int[]> pairs;
    static boolean[] check;
    static String str;
    static TreeSet<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        pairs = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                pairs.add(new int[]{stack.pop(), i});
            }
        }

        check = new boolean[str.length()];
        result = new TreeSet<>();

        dfs(0, 0);

        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(int depth, int count) {
        if (depth == pairs.size()) {
            if (count > 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (!check[i]) {
                        sb.append(str.charAt(i));
                    }
                }
                result.add(sb.toString());
            }
            return;
        }

        int[] pair = pairs.get(depth);

        check[pair[0]] = true;
        check[pair[1]] = true;
        dfs(depth + 1, count + 1);

        check[pair[0]] = false;
        check[pair[1]] = false;
        dfs(depth + 1, count);
    }
}
