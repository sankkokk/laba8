import java.util.Scanner;
import static java.lang.System.exit;

class zadanie_2_laba_8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input lenght of array");
        int n = in.nextInt();
        int [] arr = new int [n];
        System.out.println("fill the array");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 3; i < n; i++){
            if (!(arr[i] == arr[i - 2] + arr[i - 3])){
                System.out.println("not padanova");
                exit(0);
            }
        }
        System.out.println("yes padanova");
    }
}
