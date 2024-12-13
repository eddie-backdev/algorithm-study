import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();

        if(first%4 == 0 && (first%100 != 0 || first%400 == 0)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        scan.close();
    }
}