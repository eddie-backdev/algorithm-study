import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char alpa = 97;
        int[] ans = new int[26];

        for(int i = 0; i<26; i++){
            ans[i] = -1;
        }

        for(int i = 0; i<26; i++){
            for(int j = 0; j<str.length(); j++){
                if( str.charAt(j) == alpa && ans[i]==-1){
                    ans[i] = j;
                }
            }
            alpa++;
        }

        for(int a : ans){
            System.out.print(a+" ");
        }

        scan.close();
    }
}