import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money = scan.nextInt();
        int T = scan.nextInt();
        int sum = 0;
        for (int i = 0; i<T; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            sum += first*second;
        }
        if(money == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        scan.close();
    }
}