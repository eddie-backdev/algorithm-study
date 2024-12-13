import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();

        if(minute-45 >= 0){
            System.out.println(hour+" "+(minute-45));
        }
        else{
            if (hour==0){
                System.out.println("23 "+(60 - (45 - minute)));
            }
            else {
                System.out.println((hour-1)+" "+(60 - (45 - minute)));
            }
        }
        scan.close();
    }
}