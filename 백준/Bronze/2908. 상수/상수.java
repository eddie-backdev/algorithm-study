import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();

        StringBuffer sb = new StringBuffer(first);
        String firstReverse = sb.reverse().toString();
        sb = new StringBuffer(second);
        String secondReverse = sb.reverse().toString();

        if(Integer.parseInt(firstReverse)>Integer.parseInt(secondReverse)){
            System.out.println(firstReverse);
        }
        else{
            System.out.println(secondReverse);
        }

        scan.close();
    }
}