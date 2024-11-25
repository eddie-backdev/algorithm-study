import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        String answer = "";
        
        for (char c : input.toCharArray()){
            if (Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
            else answer += Character.toLowerCase(c);
        }
        System.out.print(answer);
    }
}