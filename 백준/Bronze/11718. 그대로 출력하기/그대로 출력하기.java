import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(str);
        }
        scan.close();
    }
}