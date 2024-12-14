import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int first = scan.nextInt();
            int second = scan.nextInt();
            if(first == 0 && second ==0) break;
            System.out.println(first+second);

        }

        scan.close();
    }
}