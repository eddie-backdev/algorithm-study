import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i = 1; i<=testCase; i++){
            int repeat = scan.nextInt();
            String str = scan.next();
            String ans = "";
            for(int j = 0; j<str.length(); j++){
                for(int k = 0; k<repeat; k++){
                    ans += str.charAt(j);
                }
            }
            System.out.println(ans);
        }

        scan.close();
    }
}