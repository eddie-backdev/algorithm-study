import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int T = scan.nextInt();
        for (int i = 1; i<=T; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            System.out.println("Case #"+i+": "+(first + second));
        }

        scan.close();
    }
}