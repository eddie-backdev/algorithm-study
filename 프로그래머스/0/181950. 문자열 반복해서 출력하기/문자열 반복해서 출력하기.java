import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        int repeat = sc.nextInt();
        
        for(int i = 0 ; i < repeat ; i++){
            System.out.print(input);
        }
    }
}