import java.util.Scanner;
import static java.lang.System.exit;

class zadanie_3_laba_8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input lenght of array");
        int n = in.nextInt();
        int [] arr = new int [n];
        System.out.println("fill the array");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("input k");
        int k = in.nextInt();
        System.out.println("input b");
        int b = in.nextInt();
        for (int i = 0, cnt = 1; i < n; i+=2, cnt++){
            if (arr[i] < k*arr[i + 1] + b){
                System.out.println("dot " + cnt + " is below the line");
            }
        }
    }
}
