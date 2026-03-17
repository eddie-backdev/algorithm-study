import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); 
                String category = st.nextToken();
                
                map.put(category, map.getOrDefault(category, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                result *= (count + 1);
            }
            
            sb.append(result - 1).append("\n");
        }
        
        System.out.print(sb);
    }
}
