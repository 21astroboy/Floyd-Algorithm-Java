import java.util.*;
public class Floyd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] str1 = in.nextLine().split(" ");
            for (int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(str1[j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = 10000;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    matrix[j][k] = Math.min(matrix[j][k],matrix[j][i]+matrix[i][k]);
                }
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]>=1000)
                    matrix[i][j]=0;
            }
        }
        for(int i = 0; i < n; i++){
            matrix[i][i]=0;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}