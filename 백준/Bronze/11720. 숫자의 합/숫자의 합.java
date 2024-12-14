import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        int length = scan.nextInt();
        String input = scan.next();

        for (int i = 0; i<length; i++){
            answer += input.charAt(i)-48;
        }

        System.out.println(answer);
        scan.close();
    }
}