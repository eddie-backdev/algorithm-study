import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.print("0");
                return;
            }
        }
        System.out.print("1");
        scan.close();
    }
}