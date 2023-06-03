import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class zadanie_6_laba_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inmut n");
        int n = in.nextInt();
        System.out.println("input m");
        int m = in.nextInt();
        System.out.println("input k");
        int k = in.nextInt();
        int [][] arr = new int [n][m];
        getArr(arr);
        PrintOut(arr);
        int max = 0;
        System.out.println("==========================");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        for (int i = 1; i < n - 1; i++){
            for (int j = 1; j < m - 1; j++){
                if (arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i][j + 1] && arr[i][j] < arr[i][j - 1]){
                    arr[i][j] = max + k;}
            }
        }
        PrintOut(arr);
        
    }
    public static void getArr(int [][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(-10, 10);
            }
        }
    }
    public static void PrintOut(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
        System.out.println();
    }
    }
}
