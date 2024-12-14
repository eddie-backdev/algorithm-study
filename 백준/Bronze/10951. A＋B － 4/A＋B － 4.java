import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int first = scan.nextInt();
            int second = scan.nextInt();
            System.out.println(first+second);
        }

        scan.close();
    }
}