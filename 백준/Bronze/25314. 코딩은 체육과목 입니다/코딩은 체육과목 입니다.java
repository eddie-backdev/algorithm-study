import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int T = scan.nextInt();
        int cnt = T/4;
        for (int i = 0; i<cnt; i++){
            System.out.print("long ");
        }
        System.out.println("int");

        scan.close();
    }
}