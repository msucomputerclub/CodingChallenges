package pascals_triangles;
import java.util.*;

public class Pascals_Triangles {
    public static void main(String[] args) {
        int numRows = 5;
        int[][] arr = new int[numRows][numRows];
        
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        
        for(int r = 2; r < numRows; r++){
            for(int c = 0; c < r; c++){
                if(c == 0)
                    arr[r][c] = 1;
                else
                    arr[r][c] = arr[r - 1][c - 1] + arr[r - 1][c];
            }
        }
        
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numRows; c++){
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}
