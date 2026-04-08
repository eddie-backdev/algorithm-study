import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Integer> firstIndexMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (!firstIndexMap.containsKey(num)) {
                firstIndexMap.put(num, i);
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(firstIndexMap.keySet());

        Collections.sort(keys, (a, b) -> {
            if (!frequencyMap.get(a).equals(frequencyMap.get(b))) {
                return frequencyMap.get(b) - frequencyMap.get(a);
            }
            return firstIndexMap.get(a) - firstIndexMap.get(b);
        });

        StringBuilder sb = new StringBuilder();
        for (int key : keys) {
            int count = frequencyMap.get(key);
            for (int i = 0; i < count; i++) {
                sb.append(key).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
