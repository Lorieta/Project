import  java.io.File;
import java.io.FileReader;

public class ArrayClass {

    public static void main(String[] arg) {
        int[][] temp = new int[3][3];
        int[][] a = { {1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int prod =1;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println( );
        }

        for (int i = 0; i < a.length; i++) {
            prod*= a[1][i];
            System.out.println(prod);
        }

    }
}