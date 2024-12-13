import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] grid = new int[9][9];

        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                grid[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(max<grid[i][j]){
                    max = grid[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }
        if(max == 0){
            row = 1;
            column = 1;
        }
        System.out.println(max);
        System.out.print(row + " " + column);
        scan.close();
    }
}