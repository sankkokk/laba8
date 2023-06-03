import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
public class zadanie_10_laba_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int[][] arr = new int[2][n];
        getArr(arr);
        PrintArr(arr);
        PrintAns(n,arr);
    }
    public static void getArr( int[][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(-10, 10);
            }
        }
    }
    public static void PrintArr( int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    public static boolean f1(double x, double y){
        return !((y<3*x+12 & y<-0.75*x+0.75) || (y<x-1 & x<4) ||
        ((1 > pow(x+2,2)+pow(y-4,2))) || (4 > pow(x-1,2)+pow(y-3,2)
        & 1 < pow(y-2,2) + pow(x-1,2)));
    }
    public static boolean f2(double x, double y){
        return (y<sqrt(36-x*x) & y >= 0);
    }
    public static boolean f1edge (double x, double y){
        return (y == sqrt(36-x*x) & y == 0);
    }
    public static boolean f2edge(double x, double y){
        return ((y == 3*x+12 & y == -0.75*x+0.75) || (y == x-1 & x<4) ||
        ((1 == pow(x+2,2)+pow(y-4,2))) || (4 == pow(x-1,2)+pow(y-3,2)
        & 1 == pow(y-2,2) + pow(x-1,2)));
    }
    public static void PrintAns (int n, int[][] arr){
        for (int i = 0; i < n; i++){
            if ((f1(arr[0][i], arr[1][i])&f1edge(arr[0][i], arr[1][i])) || f2(arr[0][i], arr[1][i])&f2edge(arr[0][i], arr[1][i]))
                System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = 0 \t");
            else if (f1(arr[0][i], arr[1][i]) || f2(arr[0][i], arr[1][i])) {
                System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = 1 \t");
            }
            else System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = -1 \t");
        }
    }
}
