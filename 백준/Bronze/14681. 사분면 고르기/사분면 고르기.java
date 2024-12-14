import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();

        if(first>0 && second>0){
            System.out.println("1");
        }
        else if(first<0 && second>0){
            System.out.println("2");
        }
        else if(first<0 && second<0){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
        scan.close();
    }
}