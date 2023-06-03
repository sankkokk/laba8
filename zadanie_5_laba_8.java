import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class zadanie_5_laba_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inmut n");
        int n = in.nextInt();
        System.out.println("input m");
        int m = in.nextInt();
        int [][] arr = new int [n][m];
        int [][] arr1 = new int [n][m];
        int cnt1 = 0, cnt2 = 0; int k = 0;
        getArr(arr);
        PrintOut(arr);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] > 0) cnt1++;
                if (arr[i][j] < 0) cnt2++;
            }
            if (cnt1 == cnt2) {
                for (int l = 0; l < m; l++){
                    arr1[k][l] = arr[i][l];
                }
                k++;
            }
            cnt1 = 0;
            cnt2 = 0;
        }
        PrintOut(arr1);
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
